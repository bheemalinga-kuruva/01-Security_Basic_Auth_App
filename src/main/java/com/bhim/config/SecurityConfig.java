package com.bhim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests((request) -> request
				.requestMatchers("/contact", "/products").permitAll()
				.anyRequest().authenticated()
		).formLogin();
		
		return http.build();
	}


}
