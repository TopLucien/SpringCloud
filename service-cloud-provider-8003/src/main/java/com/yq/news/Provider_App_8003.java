package com.yq.news;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value="com.yq.news.mapper")
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class Provider_App_8003 {
	
	public static void main(String[] args) {
		SpringApplication.run(Provider_App_8003.class, args);	
	}
}
