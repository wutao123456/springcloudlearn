package com.dlh.sericefeign.impl;

import org.springframework.stereotype.Component;

@Component
public class Sorry implements HelloService {

    @Override
    public String index(String name) {
        return "sorry "+name;
    }
}
