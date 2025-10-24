package com.msspringlab.hroauth.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorizationServerConfig {

	
	@Bean
	public RegisteredClientRepository registeredClientRepository() {
	    
	    // Cliente para a aplicação externa que consumirá seus endpoints (o seu "client")
	    RegisteredClient apiClient = RegisteredClient.withId(UUID.randomUUID().toString())
	        .clientId("external-api-client") // O ID que você usará para pedir o token
	        .clientSecret("{noop}my-super-secret-key") // A senha/chave secreta
	        .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
	        
	        // **FLUXO IDEAL PARA BACKEND-TO-BACKEND (B2B)**
	        .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS) 
	        
	        // Defina os escopos/permissões que este cliente pode pedir
	        .scope("worker:read") 
	        .scope("payroll:write")
	        .build();
	    

	    // Você pode registrar outros clientes (ex: para Service-to-Service se precisar)
	    
	    return new InMemoryRegisteredClientRepository(apiClient);
	}
	
}
