package com.msspringlab.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msspringlab.hrpayroll.entities.Payment;
import com.msspringlab.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public Payment getPayment(long workedId, int days) {
		
		System.out.println(workerHost);
		
		Map<String, String> uriVariable = new HashMap<>();
		
		uriVariable.put("id", ""+workedId);
		
		Worker worker = restTemplate.getForObject(workerHost+"/workers/{id}", Worker.class, uriVariable);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
