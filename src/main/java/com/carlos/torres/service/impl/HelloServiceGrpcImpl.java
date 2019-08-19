package com.carlos.torres.service.impl;

import org.lognet.springboot.grpc.GRpcService;

import com.carlos.torres.model.impl.HelloRequest;
import com.carlos.torres.model.impl.HelloResponse;
import com.carlos.torres.service.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@GRpcService
@Slf4j
public class HelloServiceGrpcImpl extends HelloServiceImplBase {

	@Override
	public final void hello(final HelloRequest request, final StreamObserver<HelloResponse> responseObserver) {
		
		log.info("Request received in 'hello' gRPC service...");

		final HelloResponse response = 
				HelloResponse.newBuilder()
				.setGreeting(
						new StringBuilder("Hello, ")
						.append(request.getFirstName()).append(" ").append(request.getLastName()).toString())
				.build();

		log.info("Response served");
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
