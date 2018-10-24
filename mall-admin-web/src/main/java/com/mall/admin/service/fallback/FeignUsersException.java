package com.mall.admin.service.fallback;

import org.springframework.stereotype.Component;

import com.mall.admin.service.FeignUserService;
import com.mall.uums.model.Users;
@Component
public class FeignUsersException implements FeignUserService{

	public String sayHiFromClientOne(String name) {
		return "error:"+name;
	}

	@Override
	public Users testa() {
		System.out.println("baocuo------------");
		return new Users();
	}

	@Override
	public String testadd() {
		// TODO Auto-generated method stub
		return null;
	}

}
