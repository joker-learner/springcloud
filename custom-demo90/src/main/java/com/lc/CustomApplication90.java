package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.lc.controller")
@EnableEurekaClient
public class CustomApplication90 {
    public static void main(String[] args) {
        SpringApplication.run(CustomApplication90.class, args);
    }

    @Bean  //用于注入别人写的类
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
