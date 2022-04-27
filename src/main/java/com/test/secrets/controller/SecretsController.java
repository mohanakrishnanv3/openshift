package com.test.secrets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretsController {
	
	@GetMapping("/test")
	public String test()
	{
		Map<String, String> env = System.getenv();
		for (Map.Entry<String, String> i : env.entrySet())
		{
		    System.out.println(i.getKey() +" : "+i.getValue());
		}
		return "Testing";
	}

}
