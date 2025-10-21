package com.msspringlab.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msspringlab.hroauth.entities.User;
import com.msspringlab.hroauth.feingclients.UserFeingClient;

@Service
public class UserService {

	@Autowired
	private UserFeingClient userFeingClient;
	
	private static Logger logger = LoggerFactory.getLogger(User.class);
	
	public User findByEmail(String email) {
		User user = userFeingClient.findByEmail(email).getBody();
		
		if(user == null){
			logger.error("Email not found"+email);
			throw new IllegalArgumentException("Email não encontrado");
		}
		
		logger.error("Email found"+email);
		return user;
	}
	
}
