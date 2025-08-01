package com.msspringlab.hrapigateway.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="gateway")
public class gateway {

	@GetMapping(value="/")
	public String teste() {
		return  "teste";
	}
	
}
