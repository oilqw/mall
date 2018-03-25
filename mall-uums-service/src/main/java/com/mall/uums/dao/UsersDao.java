package com.mall.uums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mall.uums.model.Users;

public interface UsersDao extends JpaRepository<Users,Integer>{
	  
	 @Query("select a from Users a where a.id = ?1") 
	 public Users findByAccountId(Integer accountId);
	 //User findByName(String name);

	 //User findByNameAndAge(String name, Integer age);
}