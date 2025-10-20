package com.msspringlab.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableDiscoveryClient
@SpringBootApplication
public class HrUserApplication {
	
	@Autowired
	private BCryptPasswordEncoder passowrdEncoder;

	public static void main(String[] args) {
		System.out.println("iniciando");
		SpringApplication.run(HrUserApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	  // System.out.println("BCRYPT = "+ passowrdEncoder.encode("123456"));	
	}
	


}
