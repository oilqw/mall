/*package com.test.db;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mall.uums.dao.UsersDao;
import com.mall.uums.model.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:database.xml"})
public class TestDb {

	@Resource
	private UsersDao ur;
	@Test
	public void testD(){
		System.out.println(123);
		Users aa=ur.findOne(1);
		System.out.println(aa.getUsername()+"=[=");
		for(Users at:ur.findAll()){
			System.out.println(at.getUsername());
		}
		aa.setUsername("testjpa");
		ur.save(aa);
		Users tt=ur.findByAccountId(1);
		System.out.println("saveok"+tt.getUsername());
	}


}
*/