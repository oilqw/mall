package com.mall.msg.rabbitmq;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestSender {
	@Resource
	private AmqpTemplate amqpTemplate;
	public void send(String key,String msg){
		amqpTemplate.convertAndSend(key,msg);
	}
	public void send(String ext,String key,String msg){
		amqpTemplate.convertAndSend(ext,key,msg);
	}
}
