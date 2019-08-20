package com.carlos.torres.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.torres.model.impl.HelloFullNameRequestDto;
import com.carlos.torres.model.impl.HelloRequest;
import com.carlos.torres.model.impl.HelloResponse;
import com.carlos.torres.service.HelloServiceGrpc;
import com.carlos.torres.service.HelloServiceGrpc.HelloServiceBlockingStub;
import com.carlos.torres.service.HelloServiceGrpc.HelloServiceStub;
import com.carlos.torres.service.HelloServiceRest;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class HelloServiceRestImpl implements HelloServiceRest {

	@Autowired
	private ManagedChannel managedChannel;
	
	@Override
	public HelloServiceBlockingStub getHelloServiceBlockingStub() {
		log.info("Returning synchronous/blocking gRPC stub");
		return HelloServiceGrpc.newBlockingStub(managedChannel);
	}

	@Override
	public HelloServiceStub getHelloServiceStub() {
		log.info("Returning asynchronous/non-blocking gRPC stub");
		return HelloServiceGrpc.newStub(managedChannel);
	}
	
	private HelloRequest getHelloRequest(final String firstName, final String lastName) {
		return HelloRequest.newBuilder()
				.setFirstName(firstName)
				.setLastName(lastName)
				.build();
	}
	
	@GetMapping("/sync")
	@Override
	public ResponseEntity<String> helloSync(
			@Valid @RequestParam(value = "firstName", required = true) String firstName, 
			@Valid @RequestParam(value = "lastName", required = true) String lastName) {
		
		if(StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
			throw new IllegalArgumentException("'firstName' and 'lastName' cannot be null or empty");
		}
		
		log.info("Received REST request to 'helloSync'...");
		
		final HelloRequest helloRequest = this.getHelloRequest(firstName, lastName);
		
		final HelloResponse helloResponse = this.getHelloServiceBlockingStub().hello(helloRequest);
		
		final ResponseEntity<String> response;
		
		if(helloResponse == null || helloResponse.getGreeting().isEmpty()) {
			log.error("Something went wrong. Review and try again");
			response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			response = new ResponseEntity<>(helloResponse.getGreeting(), HttpStatus.OK);
		}				
		log.info("Serving REST response: " + response.toString());
		return response;
	}

	@PostMapping("/async")
	@Override
	public ResponseEntity<List<String>> helloAsync(@Valid @RequestBody List<HelloFullNameRequestDto> nameList) {
		
		if(nameList == null || nameList.isEmpty()) {
			throw new IllegalArgumentException("Input list cannot be null or empty");
		}
		
		log.info("Received REST request to 'helloSync'...");		
		
		final List<String> resList = new ArrayList<>(nameList.size());
		
		nameList.forEach(fullName -> 
			this.getHelloServiceStub().hello(this.getHelloRequest(fullName.getFirstName(), fullName.getLastName()), new StreamObserver<HelloResponse>() {

			@Override
			public final void onNext(final HelloResponse value) {
				log.info("'onNext' with " + value.toString());
				resList.add(value.getGreeting());
			}

			@Override
			public final void onError(final Throwable t) {
				log.error(t.getMessage());				
			}

			@Override
			public final void onCompleted() {
				log.info("Completed !!");
			}			
		}));
		
		log.info("Sleeping to build the result list...");
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException iExcp) { /* Nothing to be done */ }
		log.info("Serving REST response");
		return new ResponseEntity<>(resList, HttpStatus.OK);
	}	

}
