package com.nab.msclient.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hello")
public class TestController {
/*
   @Autowired
   private RestTemplate restTemplate;

   public TestController(){
       //For Spring
   }

   @RequestMapping
   public String doHELLO() {
       return "hello from msclient";
   }

   @RequestMapping("/rest")
   public String doHELLORest() {
       return new RestTemplate().getForObject("http://localhost:8080/hello", String.class);
   }

   @RequestMapping("/rest/ribbon")
   public String doRestHELLOUsingEurekaAndRibbon() {
       return restTemplate.getForObject("http://MsHelloTest/hello", String.class);
   }*/

   // con FEIGN

    @Autowired
    private TestFeign testFeign;
    
    @RequestMapping("/rest/feign")
    @HystrixCommand(fallbackMethod="helloFallBack")
    public String doRestHELLOUsingFeign() {
        return testFeign.doHELLO();
    }
    
     
    public String helloFallBack() {
        return "Hello World -- CUIRCUIT BREAKER OPEN ";
    }
}