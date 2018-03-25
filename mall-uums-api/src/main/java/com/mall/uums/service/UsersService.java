package com.mall.uums.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
public interface UsersService {
	/*@RequestMapping(value = "test", method = RequestMethod.GET)
	public Users testa();*/
	@RequestMapping(value = "usersService-remote/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
