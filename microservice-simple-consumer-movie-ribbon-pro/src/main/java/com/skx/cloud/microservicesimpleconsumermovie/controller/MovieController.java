package com.skx.cloud.microservicesimpleconsumermovie.controller;


import com.skx.cloud.microservicesimpleconsumermovie.entity.User;
import com.skx.cloud.microservicesimpleconsumermovie.feign.FeignTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

     //@LoadBalanced  //ribbon 负载均衡
     @Autowired
     private FeignTestClient feignTestClient;
    @RequestMapping(value = "movie/{id}",method = RequestMethod.POST )
    public User findById(@PathVariable  Long id){

        System.out.println("123123123123123");
        //(User)this.restTemplate.getForObject("http://mircoservice-simple-provider-user/simple/"+id,User.class);
        return feignTestClient.findUser(id);
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
