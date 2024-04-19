package com.example.demo.handler.service.impl;

import com.example.demo.entity.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.handler.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jack
 * @since 2024-04-19
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
