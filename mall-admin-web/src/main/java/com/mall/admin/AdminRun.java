package com.mall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//启动扫描
@SpringBootApplication
//客户端注册获取服务
@EnableEurekaClient
//实现Feign负载
@EnableFeignClients
//断路器
//@EnableCircuitBreaker
//断路器面板
//@EnableHystrixDashboard
public class AdminRun {
	public static void main(String[] args) {
		SpringApplication.run(AdminRun.class, args);
	}

}
