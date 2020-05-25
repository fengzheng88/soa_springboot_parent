package com.skx.cloud.microservicesimpleconsumermovie.feign;


import config.FeignConfigure;
import com.skx.cloud.microservicesimpleconsumermovie.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "mircoservice-simple-provider-user",configuration = FeignConfigure.class)
public interface FeignTestClient {

    //@RequestMapping(value = "movie/{id}",method = RequestMethod.POST)
    //public User findUser(@PathVariable Long id);

    /**
     * 当使用feign默认的Contract契约时，以上的代码需要改成如下，才能正确执行
     * 当使用feign默认的Contract契约时，以上的代码需要改成如下，才能正确执行
     * 当使用feign默认的Contract契约时，以上的代码需要改成如下，才能正确执行
     * @param id
     * @return
     */
    @RequestLine(value = "POST /movie/{id}")
    public User findUser(@Param("id") Long id);

}
