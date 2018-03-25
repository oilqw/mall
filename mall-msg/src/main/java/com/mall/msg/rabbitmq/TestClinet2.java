package com.mall.msg.rabbitmq;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@EnableScheduling
@RabbitListener(queues = MsgContent.quene1)
public class TestClinet2{
	//@Payload
	@RabbitHandler
	public void processss(String orderXML) throws UnsupportedEncodingException {
		System.out.println("client2:"+orderXML);
	    //处理内容
		/*String[] listStr = orderXML.split(",");
		byte[] listByte = new byte[listStr.length];
		for (int i = 0; i < listStr.length; i++) {
		listByte[i] = new Byte(listStr[i]);
		}
		orderXML = new String(listByte, "UTF-8");*/
	}
}
