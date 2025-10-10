package com.msspringlab.hrworker.resources;

import java.lang.System.Logger;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msspringlab.hrworker.entities.Worker;
import com.msspringlab.hrworker.repositories.WorkerRepository;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();

		return ResponseEntity.ok(list);
	} 
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long  id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	} 
	

	@GetMapping(value = "/configs")
	public ResponseEntity<String> getConfigs(){
		 return new ResponseEntity<>("teste "+testConfig, (Objects.requireNonNull(HttpStatus.OK)));
	} 
	
	
	@GetMapping(value = "/teste")
	public void teste(){
			System.out.println("te4ste");
	} 
	
	
}
