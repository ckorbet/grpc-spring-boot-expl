package com.carlos.torres.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.carlos.torres.model.impl.HelloFullNameRequestDto;

public interface HelloServiceRest {	
	
	HelloServiceGrpc.HelloServiceBlockingStub getHelloServiceBlockingStub();
	
	HelloServiceGrpc.HelloServiceStub getHelloServiceStub();
	
	ResponseEntity<String> helloSync(String firstName, String lastName);
	
	ResponseEntity<List<String>> helloAsync(List<HelloFullNameRequestDto> nameList);	
}
