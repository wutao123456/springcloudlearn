package com.dlh.sericefeign.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback:定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，fallback指定的类必须实现@FeignClient标记的接口
 * url: url一般用于调试，可以手动指定@FeignClient调用的地址
 */
@FeignClient(value = "SPRING-CLOUD-PRODUCER",fallback = Sorry.class,url = "http://www.baidu.com")
public interface HelloService {

    @RequestMapping(value = "/hello")
    public String index(@RequestParam(value = "name") String name);
}
