package com.mall.admin.service.fallback;

import org.springframework.stereotype.Component;

import com.mall.admin.service.FeignUserService;
@Component
public class FeignUsersException implements FeignUserService{

	public String sayHiFromClientOne(String name) {
		return "error:"+name;
	}

}
