package com.mall.admin.service;


import com.mall.admin.service.fallback.FeignUsersException;
import com.mall.uums.service.UsersService;
import org.springframework.cloud.openfeign.FeignClient;

/*,fallback=FeignUsersException.class*/
@FeignClient(value="UUMS-SERVER",fallback=FeignUsersException.class)
public interface FeignUserService extends UsersService{
}
