package com.sun.eurakaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * TODO 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 *
 * */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurakaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaclientApplication.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/index")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}
}
