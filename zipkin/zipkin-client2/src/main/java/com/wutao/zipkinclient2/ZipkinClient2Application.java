package com.wutao.zipkinclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinClient2Application.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/miya")
	public String callHi(){
		return restTemplate.getForObject("http://localhost:8988/hello",String.class);
	}

	@RequestMapping(value = "/hi")
	public String info(){
		return "hi,i am service-miya";
	}
}
