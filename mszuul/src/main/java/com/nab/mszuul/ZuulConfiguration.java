package com.nab.mszuul;

import com.nab.mszuul.filter.MyZuulFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class ZuulConfiguration {
 
    public ZuulConfiguration(){
        //For Spring
    }
 
    @Bean
    public ZuulFilter buildZuulFilter(){
        return new MyZuulFilter();
    }
    
    // Call to ms --> http://localhost:8098/ribbonbackend/hello
}