package com.carlos.torres.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import javax.annotation.Generated;

import com.carlos.torres.model.impl.HelloRequest;
import com.carlos.torres.model.impl.HelloResponse;
import com.carlos.torres.model.impl.HelloServiceOuterClass;
import com.google.common.util.concurrent.ListenableFuture;

import io.grpc.BindableService;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;

/**
 */
@Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: HelloService.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "com.carlos.torres.HelloService";

  public static final MethodDescriptor<HelloRequest,
      HelloResponse> METHOD_HELLO =
      MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName("com.carlos.torres.HelloService", "hello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              HelloResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements BindableService {

    /**
     */
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO, responseObserver);
    }

    @Override public final ServerServiceDefinition bindService() {
      return ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HELLO,
            ServerCalls.asyncUnaryCall(new MethodHandlers<HelloRequest,HelloResponse>(this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends AbstractStub<HelloServiceStub> {
    private HelloServiceStub(Channel channel) {
      super(channel);
    }

    private HelloServiceStub(Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceStub build(Channel channel, CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
      asyncUnaryCall(getChannel().newCall(METHOD_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceBlockingStub build(Channel channel, CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HelloResponse hello(HelloRequest request) {
      return blockingUnaryCall(getChannel(), METHOD_HELLO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(Channel channel, CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceFutureStub build(Channel channel, CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public ListenableFuture<HelloResponse> hello(HelloRequest request) {
      return futureUnaryCall(getChannel().newCall(METHOD_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      ServerCalls.UnaryMethod<Req, Resp>,
      ServerCalls.ServerStreamingMethod<Req, Resp>,
      ServerCalls.ClientStreamingMethod<Req, Resp>,
      ServerCalls.BidiStreamingMethod<Req, Resp> {
	  
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    public void invoke(Req request, StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((HelloRequest) request, (StreamObserver<HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    public StreamObserver<Req> invoke(StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HelloServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceDescriptorSupplier())
              .addMethod(METHOD_HELLO)
              .build();
        }
      }
    }
    return result;
  }
}
