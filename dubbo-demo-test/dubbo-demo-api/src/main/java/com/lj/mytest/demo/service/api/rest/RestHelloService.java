package com.lj.mytest.demo.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.lj.mytest.demo.service.api.dubbo.User;

@Path("demo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface RestHelloService {

    @GET
    @Path("/ping")
    String ping();

    @POST
    @Path("/reg")
    String register(User user);
}
