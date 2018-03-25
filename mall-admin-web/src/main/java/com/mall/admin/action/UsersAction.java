package com.mall.admin.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.admin.service.FeignUserService;

@Controller
@RequestMapping(value="users")
public class UsersAction {
	@Resource
	private FeignUserService usersService;
	//@Resource
	//private Configuration configuration;
	
	//private static StringTemplateLoader loader = new StringTemplateLoader();
	
	@ResponseBody
	@RequestMapping(value="hi")
	public String test(){
		System.out.println(123);
		String s=usersService.sayHiFromClientOne("abcd");
		System.out.println(s);
		return s; 
	}
/*	@ResponseBody
	@RequestMapping(value="hello")
	public String tes(Model models){ 
		//Users user=usersService.testa();
		//model.addAttribute("name", user.getUsername());	
		//model.addAttribute("name", "testabc");
		loader.putTemplate("CONTENT_1", "<!DOCTYPE html><html><body><h4>亲爱的${toUserName}，你好！</h4><p style='color:blue;'> ${message}</p>祝：开心！</br>${fromUserName}</br>${time?date}</body></html>");
		configuration.setOutputEncoding("UTF-8");
		configuration.setTemplateLoader(loader);
		String content ="";
		try {
			Map<String, Object> model = new HashMap<String, Object>();  
			model.put("time", new Date());  
			model.put("message", "这是测试的内容。。。");  
			model.put("toUserName", "张三");  
			model.put("fromUserName", "老许");  
			model.put("name", "这是测试的内容。。。");  
			  
			Template t = configuration.getTemplate("CONTENT_1"); // freeMarker template  
			content = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
		    System.out.println(content);
		    
		} catch (Exception e) {
			e.printStackTrace();
	 
		}
		return content;  
	}*/
	
	@RequestMapping(value="hellos")
	public String tesss(Model models){ 
		try {
			Map<String, Object> model = new HashMap<String, Object>();  
			model.put("time", new Date());  
			model.put("message", "这是测试的内容。。。");  
			model.put("toUserName", "张三");  
			model.put("fromUserName", "老许");  
			model.put("name", "这是测试的内容。。。");  
			  
			models.addAttribute("name", "abced");
		} catch (Exception e) {
			e.printStackTrace();
	 
		}
		return "users/hello";  
	}

}
