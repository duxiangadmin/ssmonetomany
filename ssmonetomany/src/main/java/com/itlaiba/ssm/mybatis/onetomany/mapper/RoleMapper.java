package com.itlaiba.ssm.mybatis.onetomany.mapper;

import java.util.List;

import com.itlaiba.ssm.mybatis.onetomany.pojo.Role;

public interface RoleMapper {
	public List<Role> select();
}
