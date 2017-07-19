package com.lj.mytest.demo.service.api.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: hello.proto")
public class GrpcHelloServiceGrpc {

  private GrpcHelloServiceGrpc() {}

  public static final String SERVICE_NAME = "hello.GrpcHelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.lj.mytest.demo.service.api.grpc.PingRequest,
      com.lj.mytest.demo.service.api.grpc.PingResponse> METHOD_PING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "hello.GrpcHelloService", "ping"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lj.mytest.demo.service.api.grpc.PingRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lj.mytest.demo.service.api.grpc.PingResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcHelloServiceStub newStub(io.grpc.Channel channel) {
    return new GrpcHelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcHelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GrpcHelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcHelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GrpcHelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GrpcHelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.lj.mytest.demo.service.api.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.lj.mytest.demo.service.api.grpc.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                com.lj.mytest.demo.service.api.grpc.PingRequest,
                com.lj.mytest.demo.service.api.grpc.PingResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcHelloServiceStub extends io.grpc.stub.AbstractStub<GrpcHelloServiceStub> {
    private GrpcHelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcHelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcHelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcHelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.lj.mytest.demo.service.api.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.lj.mytest.demo.service.api.grpc.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcHelloServiceBlockingStub extends io.grpc.stub.AbstractStub<GrpcHelloServiceBlockingStub> {
    private GrpcHelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcHelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcHelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcHelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lj.mytest.demo.service.api.grpc.PingResponse ping(com.lj.mytest.demo.service.api.grpc.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcHelloServiceFutureStub extends io.grpc.stub.AbstractStub<GrpcHelloServiceFutureStub> {
    private GrpcHelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrpcHelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcHelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrpcHelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lj.mytest.demo.service.api.grpc.PingResponse> ping(
        com.lj.mytest.demo.service.api.grpc.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcHelloServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GrpcHelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.lj.mytest.demo.service.api.grpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.lj.mytest.demo.service.api.grpc.PingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_PING);
  }

}
