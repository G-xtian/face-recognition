package com.sxl.mapper;

import com.sxl.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    User getUserInfo(String openid);
}
