package com.klinnovations.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klinnovations.feign.GreetFeignClient;

@RestController
public class WelcomeMsgController {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		
		String greetResp = greetClient.invokeGreetApi();
		
		return greetResp + ", Welcome To Java";
	}
	

}
