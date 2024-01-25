package com.examneology.residentmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ResidentManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResidentManagementServiceApplication.class, args);
	}

}
