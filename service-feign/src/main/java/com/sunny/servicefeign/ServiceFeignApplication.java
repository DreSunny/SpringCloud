package com.sunny.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//加上@EnableFeignClients注解开启Feign的功能
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard//断路器仪表盘
@EnableCircuitBreaker//仪表盘所需注释
public class ServiceFeignApplication {
	/**
	 * TODO Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。
	 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。
	 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
	 * */
	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
