package com.skx.cloud.microservicesimpleconsumermovie;

import config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
//自定义ribbon 功能区
@RibbonClient(name = "mircoservice-simple-provider-user", configuration = RibbonConfiguration.class)
public class ConsumerMovieRibbonApplication {

    @Bean
    @LoadBalanced  //ribbon 负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieRibbonApplication.class, args);
    }

}
