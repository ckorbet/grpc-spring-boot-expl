package com.carlos.torres.service.impl;

import com.carlos.torres.model.impl.HelloRequest;
import com.carlos.torres.model.impl.HelloResponse;
import com.carlos.torres.service.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

public class HelloServiceGrpcImpl extends HelloServiceImplBase {

	@Override
	public final void hello(final HelloRequest request, final StreamObserver<HelloResponse> responseObserver) {

		final HelloResponse response = 
				HelloResponse.newBuilder()
				.setGreeting(
						new StringBuilder("Hello, ")
						.append(request.getFirstName()).append(" ").append(request.getLastName()).toString())
				.build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
