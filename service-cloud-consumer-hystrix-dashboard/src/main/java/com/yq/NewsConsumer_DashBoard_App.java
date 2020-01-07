package com.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//服务监控
@EnableHystrixDashboard
public class NewsConsumer_DashBoard_App {
	public static void main(String[] args) {
		SpringApplication.run(NewsConsumer_DashBoard_App.class, args);
	}
}
