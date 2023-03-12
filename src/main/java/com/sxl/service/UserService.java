package com.sxl.service;

import com.sxl.bean.User;
import com.sxl.mapper.UserMapper;
import java.util.List;

public interface UserService {
    User getUserInfo(String openid);
}
