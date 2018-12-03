package com.sunny.servicefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 孙宇豪
 * @Date: 2018/12/3 11:39
 * @Description: TODO
 * @return
 * @Version 1.0
 */

//断路器
@FeignClient(value = "eurakaclient",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了eurakaclient服务的“/hi”接口
     * */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
