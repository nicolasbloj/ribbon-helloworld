package com.nab.mshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class MsHelloApplication {

   public MsHelloApplication(){
       //For Spring
   }

   public static void main(String[] args) {
       SpringApplication.run(MsHelloApplication.class, args);
   }
}