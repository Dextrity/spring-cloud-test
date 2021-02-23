package com.controller;

import com.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("app")
public class AppController {

    private static final String URL = "http://service-client";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    FeignService feignService;

    @ResponseBody
    @RequestMapping("/greet")
    public String greet() {
        return restTemplate.getForObject( "http://service-client/greet", String.class);
    }

    @ResponseBody
    @RequestMapping("/feignGreet")
    public String feignPower() {
        return feignService.greet();
    }
}
