package com.itlaiba.ssm.mybatis.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itlaiba.ssm.mybatis.onetomany.mapper.RoleMapper;
import com.itlaiba.ssm.mybatis.onetomany.pojo.Role;

@Service
public class RoleServiceImpl {
	@Autowired
	public RoleMapper mapper;
	
	public List<Role> select(){
		return mapper.select();
	}
}
