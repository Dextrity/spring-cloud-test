package com.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("SERVICE-CLIENT")
public interface FeignService {

    @RequestMapping("/greet")
    String greet();


}
