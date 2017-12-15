package com.nab.msconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
 
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class MsConfigApplication {
 
    public MsConfigApplication(){
        //For Spring
    }
 
    public static void main(String[] args) {
        SpringApplication.run(MsConfigApplication.class, args);
    }
}