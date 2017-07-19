package com.lj.mytest.demo.service.impl.thrift;
import com.lj.mytest.demo.service.api.thrift.ThriftHelloService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service("thriftService")
public class HelloServiceImpl implements ThriftHelloService.Iface {

    @Override
    public String ping() throws TException {
        return "thrift service is running...";
    }
}
