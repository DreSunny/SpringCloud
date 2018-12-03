package com.sun.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 孙宇豪
 * @Date: 2018/12/1 18:11
 * @Description: TODO
 * @return
 * @Version 1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EURAKACLIENT/index?name="+name,String.class); }

    public String hiError(String name) {
        return "hi,"+name+",对不起，您的请求超时";
    }
}
