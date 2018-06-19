package com.itlaiba.ssm.mybatis.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itlaiba.ssm.mybatis.onetomany.pojo.User;
import com.itlaiba.ssm.mybatis.onetomany.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl impl;
	
	@RequestMapping("/select")
	public @ResponseBody Object select(){
		List<User> list = impl.select();
		return list;
	}
}
