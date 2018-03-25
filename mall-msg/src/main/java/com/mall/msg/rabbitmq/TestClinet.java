package com.mall.msg.rabbitmq;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestClinet{
	
	@RabbitListener(queues = MsgContent.quene1)
	public void process(String orderXML) throws UnsupportedEncodingException {
		System.out.println("client1:"+orderXML);
	}
	
	@RabbitListener(queues = MsgContent.queneTop1)
	public void process1(String orderXML) throws UnsupportedEncodingException {
		System.out.println("queneTop1:"+orderXML);
	}
	
	@RabbitListener(queues = MsgContent.queneTop2)
	public void process2(String orderXML) throws UnsupportedEncodingException {
		System.out.println("queneTop2:"+orderXML);
	}
}
