package com.mall.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinRun {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinRun.class, args);
	}

}
