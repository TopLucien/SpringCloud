package com.yq.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yq.news"})
@ComponentScan("com.yq.news")
public class Consumer_App_Feign {
	public static void main(String[] args) {
		SpringApplication.run(Consumer_App_Feign.class, args);
	}
}
