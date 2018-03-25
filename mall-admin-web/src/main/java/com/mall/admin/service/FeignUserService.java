package com.mall.admin.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.mall.uums.service.UsersService;
/*,fallback=FeignUsersException.class*/
@FeignClient(value="UUMS-SERVER")
public interface FeignUserService extends UsersService{
}
