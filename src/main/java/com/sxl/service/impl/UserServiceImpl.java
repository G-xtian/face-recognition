package com.sxl.service.impl;

import com.sxl.bean.User;
import com.sxl.mapper.UserMapper;
import com.sxl.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户登录接口service
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    /**
     * 根据openid查询数据库
     * @param openid 微信用户id
     * @return 返回User对象
     */
    @Override
    public User getUserInfo(String openid) {
        User user = userMapper.getUserInfo(openid);
        return user;
    }
}
