package com.sun.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO  Euraka 服务端（注册中心）其他server 都需要在这里注册
 * */
@EnableEurekaServer
@SpringBootApplication
public class EurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaApplication.class, args);
	}
}
