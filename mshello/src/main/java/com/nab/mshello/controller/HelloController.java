package com.nab.mshello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nab.mshello.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping
	public String hello() {
		return helloService.hello();
	}
}
