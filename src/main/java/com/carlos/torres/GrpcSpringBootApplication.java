package com.carlos.torres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * Main Spring Boot 2 Application class for the gRPC example
 * </p>
 */
@SpringBootApplication
@Slf4j
public class GrpcSpringBootApplication {
	
	public static void main(final String[] args) {
        SpringApplication.run(GrpcSpringBootApplication.class, args);
    }
	
	@Bean
	public ManagedChannel managedChannel() {
		log.info("Initializing gRPC ManagedChannel bean...");
		final ManagedChannel resChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
		log.info("Returning gRPC ManagedChannel bean");
		return resChannel;
	}
}
