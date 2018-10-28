package com.dlh.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiservice(String name){
        //当下面的服务挂了就开启熔断,请求下面方法hiError
        return restTemplate.getForObject("http://spring-cloud-producer/hello?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi "+name+" sorry,error";
    }
}
