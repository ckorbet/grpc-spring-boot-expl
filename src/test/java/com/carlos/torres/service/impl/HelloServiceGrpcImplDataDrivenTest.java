package com.carlos.torres.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.carlos.torres.GrpcSpringBootApplication;
import com.carlos.torres.model.impl.HelloRequest;
import com.carlos.torres.model.impl.HelloResponse;

import io.grpc.stub.StreamObserver;
import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import lombok.extern.slf4j.Slf4j;

@RunWith(JUnitParamsRunner.class)
@SpringBootTest(classes = GrpcSpringBootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class HelloServiceGrpcImplDataDrivenTest {
	
	private HelloServiceGrpcImpl service = new HelloServiceGrpcImpl();
	
	@Before
	public final void checkPreConditions() {
		assertThat(service).isNotNull();
	}

	@Test
	@TestCaseName("[{index}] {0}, {1}")
	@Parameters(named = "helloRequestSingleData")
	public void testHelloSingleData(final HelloRequest request) {
		// given
		assertThat(request).isNotNull();
		
		// when
		this.service.hello(request, new StreamObserver<HelloResponse>() {
			@Override
			public final void onNext(final HelloResponse value) {
				// then
				assertThat(value).isNotNull();
				assertThat(value.getGreeting()).isEqualTo("Hello, Carlos Torres");
			}

			@Override
			public final void onError(final Throwable t) { log.error(t.getMessage()); }

			@Override
			public final void onCompleted() { log.info("Completed !!"); }			
		});		
	}
	
	@Test
	@TestCaseName("[{index}] {0}, {1}")
	@Parameters(named = "helloRequestMultipleData")
	public void testHelloMultipleData(final HelloRequest request) {
		// given
		assertThat(request).isNotNull();
		
		// when
		this.service.hello(request, new StreamObserver<HelloResponse>() {
			@Override
			public final void onNext(final HelloResponse value) {
				// then
				assertThat(value).isNotNull();
				assertThat(value.getGreeting()).isNotBlank();
				assertThat(value.getGreeting()).startsWith("Hello, ");
			}

			@Override
			public final void onError(final Throwable t) { log.error(t.getMessage()); }

			@Override
			public final void onCompleted() { log.info("Completed !!"); }			
		});		
	}
	
	@NamedParameters("helloRequestSingleData")
	private Collection<Object[]> helloRequestSingleData() {
		return new ArrayList<Object[]>() {
        	private static final long serialVersionUID = 1L;
			{
        		add(new Object[] {
        				HelloRequest.newBuilder()
        				.setFirstName("Carlos")
        				.setLastName("Torres")
        				.build()}
        				);
        	}        	
        };		
	}
	
	@NamedParameters("helloRequestMultipleData")
	private Collection<Object[]> helloRequestMultipleData() {
		return new ArrayList<Object[]>() {
        	private static final long serialVersionUID = 1L;
			{
        		add(new Object[] {
        				HelloRequest.newBuilder()
        				.setFirstName("Dimitri")
        				.setLastName("Klokov")
        				.build()});
        		add(new Object[] {
        				HelloRequest.newBuilder()
        				.setFirstName("Piros")
        				.setLastName("Dimas")
        				.build()});
        		add(new Object[] {
        				HelloRequest.newBuilder()
        				.setFirstName("Lu")
        				.setLastName("Xiaojun")
        				.build()});
        		add(new Object[] {
        				HelloRequest.newBuilder()
        				.setFirstName("Ilya")
        				.setLastName("Ilyin")
        				.build()
        		});
        	}        	
        };		
	}
}
