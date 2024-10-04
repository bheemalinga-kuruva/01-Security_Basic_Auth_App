package com.bhim.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg="Wel come to Andhra Pradesh";
		return msg;
	}
}
