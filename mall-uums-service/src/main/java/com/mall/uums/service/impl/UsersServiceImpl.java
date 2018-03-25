package com.mall.uums.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.mall.uums.service.UsersService;
@RestController
public class UsersServiceImpl implements UsersService{
	//@Resource
	//private UsersDao usersDao;
	/*public Users testa(){
		Users user=usersDao.findByAccountId(1);
		return user;
	}*/
	public String sayHiFromClientOne(String name) {
		return "welcome:"+name;
	}
}