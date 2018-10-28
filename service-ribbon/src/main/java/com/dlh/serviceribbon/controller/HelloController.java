package com.dlh.serviceribbon.controller;

import com.dlh.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(String name){
        return helloService.hiservice(name);
    }
}
