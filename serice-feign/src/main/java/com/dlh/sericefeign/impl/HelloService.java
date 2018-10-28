package com.dlh.sericefeign.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SPRING-CLOUD-PRODUCER",fallback = Sorry.class)
public interface HelloService {

    @RequestMapping(value = "/hello")
    public String index(@RequestParam(value = "name") String name);
}
