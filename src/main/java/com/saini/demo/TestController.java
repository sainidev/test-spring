package com.saini.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String about() {
		return "A spring boot application created by Satish Saini";
	}

	@GetMapping("/greet/{user}")
	public String greetUser(@PathVariable("user") String user) {
		return "Hello, how are you " + user;
	}
	
}
