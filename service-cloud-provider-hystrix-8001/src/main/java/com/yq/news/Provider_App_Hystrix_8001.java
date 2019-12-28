package com.yq.news;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value="com.yq.news.mapper")
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker//对Hystrix熔断机制的支持
public class Provider_App_Hystrix_8001 {
	
	public static void main(String[] args) {
		SpringApplication.run(Provider_App_Hystrix_8001.class, args);	
	}
}
