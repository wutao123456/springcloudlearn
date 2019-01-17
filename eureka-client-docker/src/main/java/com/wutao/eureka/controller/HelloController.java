package com.wutao.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this port is " + port;
    }
}
