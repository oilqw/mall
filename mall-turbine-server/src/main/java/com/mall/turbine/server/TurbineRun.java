package com.mall.turbine.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineRun {
	public static void main(String[] args) {
		SpringApplication.run(TurbineRun.class, args);
	}

}
