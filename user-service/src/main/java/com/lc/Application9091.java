package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lc.mapper")
@EnableDiscoveryClient  //开启eureka客户端发现功能
public class Application9091 {
    public static void main(String[] args) {
        SpringApplication.run(Application9091.class, args);
    }
}
