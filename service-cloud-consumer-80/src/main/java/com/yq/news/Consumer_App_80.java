package com.yq.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.yq.myRule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SC-PROVIDER",configuration=MySelfRule.class)
public class Consumer_App_80 {
	public static void main(String[] args) {
		SpringApplication.run(Consumer_App_80.class, args);
	}
}
