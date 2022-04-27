package com.test.secrets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretsController {
	
	@GetMapping("/test")
	public String test()
	{
		return "Testing";
	}

}
