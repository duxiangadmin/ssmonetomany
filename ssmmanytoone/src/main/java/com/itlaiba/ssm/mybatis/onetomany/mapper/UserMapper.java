package com.itlaiba.ssm.mybatis.onetomany.mapper;

import java.util.List;

import com.itlaiba.ssm.mybatis.onetomany.pojo.User;

public interface UserMapper {
	public List<User> select();
}
