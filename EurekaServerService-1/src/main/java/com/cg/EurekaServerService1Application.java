package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerService1Application.class, args);
	}

}
