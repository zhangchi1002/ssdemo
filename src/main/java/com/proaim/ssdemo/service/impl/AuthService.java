package com.proaim.ssdemo.service.impl;

import com.proaim.ssdemo.dao.UserMapper;
import com.proaim.ssdemo.entity.User;
import com.proaim.ssdemo.entity.UserExample;
import com.proaim.ssdemo.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AuthService implements IAuthService {
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUserList(){
        UserExample example = new UserExample();
        example.createCriteria().andIdIsNotNull();

        return userMapper.selectByExample(example);
    }
}
