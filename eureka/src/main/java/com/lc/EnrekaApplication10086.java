package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EnrekaApplication10086 {
    public static void main(String[] args) {
        SpringApplication.run(EnrekaApplication10086.class, args);
    }

}
