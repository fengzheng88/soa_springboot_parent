package com.skx.cloud.mircoservicediscoveryeureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


import javax.sql.DataSource;


@SpringBootApplication
@EnableEurekaServer   //Eureka 服务
//@EnableWebSecurity   //web工程Security 默认安全配置
//@EnableGlobalAuthentication   //非web工程Security 默认安全配置启动
public class EurekaApplication {
	public static void main(String[] args) {
		      SpringApplication.run(EurekaApplication.class, args);
	}
}
