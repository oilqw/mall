package com.mall.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 
 
 
/** 
* @ClassName: EurekaRun 
* @Description: 服务注册中心 
* @author OuWenjie 
* @date 2018年3月7日 下午8:57:24 
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaRun {
	public static void main(String[] args) {
		SpringApplication.run(EurekaRun.class, args);
	}

}
