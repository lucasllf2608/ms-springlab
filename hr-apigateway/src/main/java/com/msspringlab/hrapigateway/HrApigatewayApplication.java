package com.msspringlab.hrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HrApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApigatewayApplication.class, args);
	}

}
