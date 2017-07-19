package com.lj.mytest.demo.service.impl.avro;

import org.apache.avro.AvroRemoteException;
import org.springframework.stereotype.Service;

import com.lj.mytest.demo.service.api.avro.AvroHelloService;


@Service("avroService")
public class HelloServiceImpl implements AvroHelloService {

    @Override
    public CharSequence ping() throws AvroRemoteException {
        return "avro service is running...";
    }
}
