package com.lj.mytest.demo.service.impl.dubbo;


import com.lj.mytest.demo.service.api.dubbo.DubboHelloService;
import com.lj.mytest.demo.service.api.dubbo.User;
import org.springframework.stereotype.Service;

@Service("dubboService")
public class HelloServiceImpl implements DubboHelloService {

    @Override
    public String ping() {
        return "dubbo service is running...";
    }

    @Override
    public String register(User user) {
        return String.format("%s register ok!", user.getUserName());
    }
}
