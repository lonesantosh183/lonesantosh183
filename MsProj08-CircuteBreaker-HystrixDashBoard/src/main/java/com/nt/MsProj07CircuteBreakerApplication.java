package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class MsProj07CircuteBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj07CircuteBreakerApplication.class, args);
	}

}
