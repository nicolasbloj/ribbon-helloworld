package com.nab.mszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
//@EnableDiscoveryClient
@SpringBootApplication
public class MsZuulApplication {

	public MsZuulApplication() {
		// For Spring
	}

	public static void main(String[] args) {
		SpringApplication.run(MsZuulApplication.class, args);

	}
}
