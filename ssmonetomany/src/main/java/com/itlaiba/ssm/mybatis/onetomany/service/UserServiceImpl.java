package com.itlaiba.ssm.mybatis.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itlaiba.ssm.mybatis.onetomany.mapper.UserMapper;
import com.itlaiba.ssm.mybatis.onetomany.pojo.User;

@Service
@Transactional
public class UserServiceImpl {

	@Autowired
	UserMapper mapper;
	
	public List<User> select(){
		return mapper.select();
	}
}
