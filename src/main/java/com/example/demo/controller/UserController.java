package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jack
 * @since 2024-04-19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private TestService testService;

    @PostMapping("/info")
    public List<User> listUser() {
        return testService.listUser();
    }

}
