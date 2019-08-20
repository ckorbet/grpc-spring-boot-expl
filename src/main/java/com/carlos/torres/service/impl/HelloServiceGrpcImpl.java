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
		
		log.info(new StringBuilder("Received gRPC request with [firstName='")
				.append(request.getFirstName())
				.append("'] and [lastName='").append(request.getLastName()).append("']...").toString());

		final HelloResponse response = 
				HelloResponse.newBuilder()
				.setGreeting(
						new StringBuilder("Hello, ")
						.append(request.getFirstName()).append(" ").append(request.getLastName()).toString())
				.build();

		log.info("Serving gRPC response: " + response.toString());
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}