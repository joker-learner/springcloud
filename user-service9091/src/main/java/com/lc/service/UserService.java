package com.lc.service;

import com.lc.mapper.UserMapper;
import com.lc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Users findById(long id) {
        Users user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
