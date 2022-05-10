package com.test.secrets.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretsController {
	
	@Autowired
	ConfigurableEnvironment environment;
	
	private static final String DS_PWD = "spring.datasource.password";
	private static final String SECRET_DS_PSWD = "SPRING_DATASOURCE_PSWD";
	
	@GetMapping("/test")
	public String test()
	{
		Map<String, String> env = System.getenv();
		for (Map.Entry<String, String> i : env.entrySet())
		{
		    System.out.println(i.getKey() +" : "+i.getValue());
		}
		
		System.out.println("Datasource from secrets: "+environment.getProperty(SECRET_DS_PSWD));
    	
    	System.out.println("Datasource from  configmap: "+environment.getProperty(DS_PWD));
		
		return "Testing";
	}

}
