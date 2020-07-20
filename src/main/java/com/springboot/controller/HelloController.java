package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@RequestMapping(method = RequestMethod.GET , path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Something need to be printed";
		
	}

}
