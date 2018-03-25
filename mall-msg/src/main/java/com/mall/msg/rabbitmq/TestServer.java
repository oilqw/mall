package com.mall.msg.rabbitmq;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("msg")
@RestController
public class TestServer {
	@Resource
	private TestSender testSender;

	@RequestMapping("index")
	public void index(String name){
		System.out.println(123);
		for(int i=0;i<10;i++){
			testSender.send(MsgContent.quene1, name);
		}
	}
	
	@RequestMapping("snd1")
	public void indexs(String name){
			testSender.send(MsgContent.exchange,MsgContent.queneTop1, name);
	}
	@RequestMapping("snd2")
	public void index2(String name){
			testSender.send(MsgContent.exchange,MsgContent.queneTop2, name);
	}
	
	@RequestMapping("snd3")
	public void index3(String name){
			testSender.send(MsgContent.fanoutExchange,"", name);
	}
	
}
