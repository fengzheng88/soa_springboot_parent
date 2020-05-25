package com.skx.cloud.microservicesimpleconsumermovie.controller;


import com.skx.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping(value = "movie/{id}")
    public User findById(@PathVariable  Long id){
        return  (User)this.restTemplate.getForObject("http://mircoservice-simple-provider-user/simple/"+id,User.class);
    }

    @GetMapping(value = "/test")
    public  String test(){

        ServiceInstance serviceInstance=this.loadBalancerClient.choose("mircoservice-simple-provider-user");
        System.out.println("111:"+serviceInstance.getHost()+":"+serviceInstance.getPort()+":"+serviceInstance.getServiceId());
        ServiceInstance serviceInstance2=this.loadBalancerClient.choose("mircoservice-simple-provider-user2");
        System.out.println("222:"+serviceInstance2.getHost()+":"+serviceInstance2.getPort()+":"+serviceInstance2.getServiceId());
        return  "1";
    }
}
