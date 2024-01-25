package com.examneology.entranceexitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EntranceExitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntranceExitServiceApplication.class, args);
	}

}
