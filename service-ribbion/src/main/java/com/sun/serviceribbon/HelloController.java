package com.sun.serviceribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 孙宇豪
 * @Date: 2018/12/1 18:12
 * @Description: TODO
 * @return
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam("name") String name){
        return helloService.hiService(name);
    }
}
