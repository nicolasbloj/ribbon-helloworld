package com.nab.msclient.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@FeignClient("MSHelloTest")
public interface TestFeign {
 
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    String doHELLO();
}
