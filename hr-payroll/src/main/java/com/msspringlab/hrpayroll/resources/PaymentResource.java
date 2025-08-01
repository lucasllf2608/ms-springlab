package com.msspringlab.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msspringlab.hrpayroll.entities.Payment;
import com.msspringlab.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value="payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;
	
	@GetMapping(value="/teste")
	public String teste() {
		return  "teste";
	}
	
	@GetMapping(value="/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
}
