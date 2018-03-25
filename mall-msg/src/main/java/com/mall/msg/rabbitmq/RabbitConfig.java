package com.mall.msg.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public Queue Queue() {
		return new Queue(MsgContent.quene1);
	}

	@Bean
	public Queue testmsg1() {
		return new Queue(MsgContent.queneTop1);
	}

	@Bean
	public Queue testmsg2() {
		return new Queue(MsgContent.queneTop2);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange("exchange");
	}

	@Bean
	Binding buildTop1(Queue testmsg1, TopicExchange exchange) {
		return BindingBuilder.bind(testmsg1).to(exchange).with(MsgContent.queneTop1);

	}
    //*表示一个词.
	//#表示零个或多个词
	@Bean
	Binding buildTop2(Queue testmsg2, TopicExchange exchange) {
		return BindingBuilder.bind(testmsg2).to(exchange).with("topic.#");

	}
	
	@Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange(MsgContent.fanoutExchange);
    }
	@Bean
    Binding bindingExchangeA(Queue Queue,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(Queue).to(fanoutExchange);
    }
	@Bean
    Binding bindingExchangeB(Queue testmsg1,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(testmsg1).to(fanoutExchange);
    }
	@Bean
    Binding bindingExchangeC(Queue testmsg2,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(testmsg2).to(fanoutExchange);
    }

}
