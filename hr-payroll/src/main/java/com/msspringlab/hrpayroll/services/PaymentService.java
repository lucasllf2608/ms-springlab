package com.msspringlab.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msspringlab.hrpayroll.entities.Payment;
import com.msspringlab.hrpayroll.entities.Worker;
import com.msspringlab.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	public Payment getPayment(long workedId, int days) {
			
		Worker worker = workerFeignClient.findById(workedId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
