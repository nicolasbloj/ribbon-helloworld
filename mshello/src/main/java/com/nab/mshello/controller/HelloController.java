package com.nab.mshello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nab.mshello.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping
	@HystrixCommand(fallbackMethod="helloFallBack")
	public String hello() {
		return helloService.hello();
	}
	
	public String helloFallBack() {
		return "Hello World ... CIRCUIT OPEN ... Fall back method";
	}
}
