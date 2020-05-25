package com.skx.cloud.microservicesimpleprovideruser.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.skx.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.skx.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

 /*   @Autowired
    private DiscoveryClient discoveryClient;*/


    @GetMapping(value = "/simple/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return this.userRepository.findById(id);
    }

  @GetMapping(value = "eureka-instance")
    public String serverurl(){
        InstanceInfo instanceInfo=this.eurekaClient.getNextServerFromEureka("MIRCOSERVICE-SIMPLE-PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }

 /*   @GetMapping(value = "eureka-info")
    public ServiceInstance showinfo(){
        ServiceInstance serviceInstance= (ServiceInstance) this.discoveryClient.getApplicationInfoManager();
        return serviceInstance ;
    }*/

}
