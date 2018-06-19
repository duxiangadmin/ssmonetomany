package com.itlaiba.ssm.mybatis.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itlaiba.ssm.mybatis.onetomany.pojo.Role;
import com.itlaiba.ssm.mybatis.onetomany.service.RoleServiceImpl;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleServiceImpl impl;
	
	@RequestMapping("show")
	public @ResponseBody Object show(){
		List<Role> list = impl.select();
		return list;
	}
}
