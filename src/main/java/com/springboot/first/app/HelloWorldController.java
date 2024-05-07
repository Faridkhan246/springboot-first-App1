package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
    
	//Get Http Method
	//http://localhost:8080
	
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello world!";
	}
	
	
	
	
	
}
