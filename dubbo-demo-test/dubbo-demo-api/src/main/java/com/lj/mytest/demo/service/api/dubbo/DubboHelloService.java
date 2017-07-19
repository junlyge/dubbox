package com.lj.mytest.demo.service.api.dubbo;


public interface DubboHelloService {

    String ping();

    String register(User user);
}
