package com.carlos.torres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Main Spring Boot 2 Application class for the gRPC example
 * </p>
 */
@SpringBootApplication
public class GrpcSpringBootApplication {	
	public static void main(final String[] args) {
        SpringApplication.run(GrpcSpringBootApplication.class, args);
    }
}
