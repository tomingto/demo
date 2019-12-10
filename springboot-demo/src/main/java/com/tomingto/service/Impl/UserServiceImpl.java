package com.tomingto.service.Impl;

import com.tomingto.mapper.UserMapper;
import com.tomingto.pojo.User;
import com.tomingto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User SelectUserById(Integer Id) {
        return userMapper.SelectUserById(Id);
    }
}
