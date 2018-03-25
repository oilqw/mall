package com.mall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//启动扫描
@SpringBootApplication
@EnableDiscoveryClient
//实现Feign负载
//@EnableFeignClients
//客户端注册获取服务
//@EnableEurekaClient
//断路器
//@EnableCircuitBreaker
//断路器面板
//@EnableHystrixDashboard
public class AdminRun {
	public static void main(String[] args) {
		SpringApplication.run(AdminRun.class, args);
	}

}
