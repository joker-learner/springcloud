package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAppl7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAppl7002.class, args);
    }
}
