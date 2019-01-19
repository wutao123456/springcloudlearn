package com.dlh.dockercompose.controller;

import com.dlh.dockercompose.entity.Visitor;
import com.dlh.dockercompose.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wutao
 * @email wutao56789@gmail.com
 * @date 2019/1/19 17:23
 */
@RestController
public class VisitorController {

    @Autowired
    private VisitorRepository visitorRepository;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request){
        String ip = request.getRemoteAddr();
        Visitor visitor = visitorRepository.findByIp(ip);
        if(visitor ==null){
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
        }else{
            visitor.setTimes(visitor.getTimes() + 1);
        }
        visitorRepository.save(visitor);
        return "I have been seen ip "+visitor.getIp()+" "+visitor.getTimes()+" times.";
    }
}
