package com.nab.mshello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nab.mshello.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloService helloService;

	@Autowired
	private Environment environment;

	@Value("${server.port}")
	private String port;

	// FROM GIT
	//@Value("${variable}")
	private String variableFromConfigServer;

	@RequestMapping
	@HystrixCommand(fallbackMethod = "helloFallBack")
	public String hello() {
		return helloService.hello();
	}

	public String helloFallBack() {
		return "Hello World ... CIRCUIT OPEN ... Fall back method";
	}

	@RequestMapping("/port")
	public String getPort() {
		// return environment.getProperty("server.port");
		return port;
	}

	@RequestMapping("/variable")
	public String getVariable() {
		return variableFromConfigServer;
	}
}
