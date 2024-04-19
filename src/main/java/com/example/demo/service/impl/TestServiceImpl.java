package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.handler.service.IUserService;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private IUserService userService;
    @Override
    public List<User> listUser() {
        return userService.list();
    }
}
