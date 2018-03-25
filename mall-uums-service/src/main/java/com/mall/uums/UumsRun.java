package com.mall.uums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UumsRun {
	public static void main(String[] args) {
		SpringApplication.run(UumsRun.class, args);
	}
}
