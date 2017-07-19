package com.lj.mytest.demo.service.impl.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lj.mytest.demo.service.api.dubbo.DubboHelloService;
import com.lj.mytest.demo.service.api.dubbo.User;
import com.lj.mytest.demo.service.api.rest.RestHelloService;

@Service("restService")
public class HelloServiceImpl implements RestHelloService {

    @Autowired
    DubboHelloService dubboHelloService;

    @Override
    public String ping() {
        return dubboHelloService.ping();
    }

    @Override
    public String register(User user) {
        return dubboHelloService.register(user);
    }
}
