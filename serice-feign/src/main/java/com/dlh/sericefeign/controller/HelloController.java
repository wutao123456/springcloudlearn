package com.dlh.sericefeign.controller;

import com.dlh.sericefeign.impl.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(String name){
        return helloService.index(name);
    }
}
