package com.sunny.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @Author: 孙宇豪
 * @Date: 2018/12/3 12:13
 * @Description: TODO 断路器
 * @return
 * @Version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+" 对不起~请求超时！";
    }
}
