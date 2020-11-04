package com.lc.controller;

import com.lc.pojo.CommomReslut;
import com.lc.pojo.Users;
import com.lc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public CommomReslut<Users> querById(@PathVariable Long id){
        Users user = userService.findById(id);
        if(user != null){
            return new CommomReslut<Users>(200 , "查询成功.." , user);
        }else {
            return new CommomReslut<Users>(500 , "没有这个人" , null);
        }

    }

}
