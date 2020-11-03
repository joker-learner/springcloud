package com.lc.controller;

import com.lc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Users querrtById(Long id) {
        String url ="http://localhost:9091/user/6";
        return restTemplate.getForObject(url, Users.class);
    }
}
