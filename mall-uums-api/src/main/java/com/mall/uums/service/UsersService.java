package com.mall.uums.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.uums.model.Users;
public interface UsersService {
	@RequestMapping(value = "usersService-remote/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
	@RequestMapping(value = "usersService-remote/test",method = RequestMethod.GET)
	Users testa();
	@RequestMapping(value = "usersService-remote/testn",method = RequestMethod.GET)
	String testadd();
}
