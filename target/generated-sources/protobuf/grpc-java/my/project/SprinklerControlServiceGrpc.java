package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SprinklerControlServiceGrpc {

  private SprinklerControlServiceGrpc() {}

  public static final String SERVICE_NAME = "project.SprinklerControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.SprinklerTypeRequest,
      my.project.MsgReply> getSetSprinklerTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setSprinklerType",
      requestType = my.project.SprinklerTypeRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.SprinklerTypeRequest,
      my.project.MsgReply> getSetSprinklerTypeMethod() {
    io.grpc.MethodDescriptor<my.project.SprinklerTypeRequest, my.project.MsgReply> getSetSprinklerTypeMethod;
    if ((getSetSprinklerTypeMethod = SprinklerControlServiceGrpc.getSetSprinklerTypeMethod) == null) {
      synchronized (SprinklerControlServiceGrpc.class) {
        if ((getSetSprinklerTypeMethod = SprinklerControlServiceGrpc.getSetSprinklerTypeMethod) == null) {
          SprinklerControlServiceGrpc.getSetSprinklerTypeMethod = getSetSprinklerTypeMethod =
              io.grpc.MethodDescriptor.<my.project.SprinklerTypeRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setSprinklerType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.SprinklerTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new SprinklerControlServiceMethodDescriptorSupplier("setSprinklerType"))
              .build();
        }
      }
    }
    return getSetSprinklerTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.ActivateSprinklersRecuest,
      my.project.MsgReply> getActivateSprinklersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateSprinklers",
      requestType = my.project.ActivateSprinklersRecuest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.ActivateSprinklersRecuest,
      my.project.MsgReply> getActivateSprinklersMethod() {
    io.grpc.MethodDescriptor<my.project.ActivateSprinklersRecuest, my.project.MsgReply> getActivateSprinklersMethod;
    if ((getActivateSprinklersMethod = SprinklerControlServiceGrpc.getActivateSprinklersMethod) == null) {
      synchronized (SprinklerControlServiceGrpc.class) {
        if ((getActivateSprinklersMethod = SprinklerControlServiceGrpc.getActivateSprinklersMethod) == null) {
          SprinklerControlServiceGrpc.getActivateSprinklersMethod = getActivateSprinklersMethod =
              io.grpc.MethodDescriptor.<my.project.ActivateSprinklersRecuest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "activateSprinklers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.ActivateSprinklersRecuest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new SprinklerControlServiceMethodDescriptorSupplier("activateSprinklers"))
              .build();
        }
      }
    }
    return getActivateSprinklersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.IrrigationScheculeRequest,
      my.project.MsgReply> getSetAutomaticIrrigationScheculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setAutomaticIrrigationSchecule",
      requestType = my.project.IrrigationScheculeRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.IrrigationScheculeRequest,
      my.project.MsgReply> getSetAutomaticIrrigationScheculeMethod() {
    io.grpc.MethodDescriptor<my.project.IrrigationScheculeRequest, my.project.MsgReply> getSetAutomaticIrrigationScheculeMethod;
    if ((getSetAutomaticIrrigationScheculeMethod = SprinklerControlServiceGrpc.getSetAutomaticIrrigationScheculeMethod) == null) {
      synchronized (SprinklerControlServiceGrpc.class) {
        if ((getSetAutomaticIrrigationScheculeMethod = SprinklerControlServiceGrpc.getSetAutomaticIrrigationScheculeMethod) == null) {
          SprinklerControlServiceGrpc.getSetAutomaticIrrigationScheculeMethod = getSetAutomaticIrrigationScheculeMethod =
              io.grpc.MethodDescriptor.<my.project.IrrigationScheculeRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setAutomaticIrrigationSchecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.IrrigationScheculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new SprinklerControlServiceMethodDescriptorSupplier("setAutomaticIrrigationSchecule"))
              .build();
        }
      }
    }
    return getSetAutomaticIrrigationScheculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SprinklerControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceStub>() {
        @java.lang.Override
        public SprinklerControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprinklerControlServiceStub(channel, callOptions);
        }
      };
    return SprinklerControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SprinklerControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceBlockingStub>() {
        @java.lang.Override
        public SprinklerControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprinklerControlServiceBlockingStub(channel, callOptions);
        }
      };
    return SprinklerControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SprinklerControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprinklerControlServiceFutureStub>() {
        @java.lang.Override
        public SprinklerControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprinklerControlServiceFutureStub(channel, callOptions);
        }
      };
    return SprinklerControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void setSprinklerType(my.project.SprinklerTypeRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSprinklerTypeMethod(), responseObserver);
    }

    /**
     */
    default void activateSprinklers(my.project.ActivateSprinklersRecuest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateSprinklersMethod(), responseObserver);
    }

    /**
     */
    default void setAutomaticIrrigationSchecule(my.project.IrrigationScheculeRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAutomaticIrrigationScheculeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SprinklerControlService.
   */
  public static abstract class SprinklerControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SprinklerControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SprinklerControlService.
   */
  public static final class SprinklerControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SprinklerControlServiceStub> {
    private SprinklerControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprinklerControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprinklerControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void setSprinklerType(my.project.SprinklerTypeRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSprinklerTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activateSprinklers(my.project.ActivateSprinklersRecuest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateSprinklersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAutomaticIrrigationSchecule(my.project.IrrigationScheculeRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAutomaticIrrigationScheculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SprinklerControlService.
   */
  public static final class SprinklerControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SprinklerControlServiceBlockingStub> {
    private SprinklerControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprinklerControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprinklerControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public my.project.MsgReply setSprinklerType(my.project.SprinklerTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSprinklerTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply activateSprinklers(my.project.ActivateSprinklersRecuest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateSprinklersMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply setAutomaticIrrigationSchecule(my.project.IrrigationScheculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAutomaticIrrigationScheculeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SprinklerControlService.
   */
  public static final class SprinklerControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SprinklerControlServiceFutureStub> {
    private SprinklerControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprinklerControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprinklerControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> setSprinklerType(
        my.project.SprinklerTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSprinklerTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> activateSprinklers(
        my.project.ActivateSprinklersRecuest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateSprinklersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> setAutomaticIrrigationSchecule(
        my.project.IrrigationScheculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAutomaticIrrigationScheculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_SPRINKLER_TYPE = 0;
  private static final int METHODID_ACTIVATE_SPRINKLERS = 1;
  private static final int METHODID_SET_AUTOMATIC_IRRIGATION_SCHECULE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_SPRINKLER_TYPE:
          serviceImpl.setSprinklerType((my.project.SprinklerTypeRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_ACTIVATE_SPRINKLERS:
          serviceImpl.activateSprinklers((my.project.ActivateSprinklersRecuest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_SET_AUTOMATIC_IRRIGATION_SCHECULE:
          serviceImpl.setAutomaticIrrigationSchecule((my.project.IrrigationScheculeRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSetSprinklerTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.SprinklerTypeRequest,
              my.project.MsgReply>(
                service, METHODID_SET_SPRINKLER_TYPE)))
        .addMethod(
          getActivateSprinklersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.ActivateSprinklersRecuest,
              my.project.MsgReply>(
                service, METHODID_ACTIVATE_SPRINKLERS)))
        .addMethod(
          getSetAutomaticIrrigationScheculeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.IrrigationScheculeRequest,
              my.project.MsgReply>(
                service, METHODID_SET_AUTOMATIC_IRRIGATION_SCHECULE)))
        .build();
  }

  private static abstract class SprinklerControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SprinklerControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.MyProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SprinklerControlService");
    }
  }

  private static final class SprinklerControlServiceFileDescriptorSupplier
      extends SprinklerControlServiceBaseDescriptorSupplier {
    SprinklerControlServiceFileDescriptorSupplier() {}
  }

  private static final class SprinklerControlServiceMethodDescriptorSupplier
      extends SprinklerControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SprinklerControlServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SprinklerControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SprinklerControlServiceFileDescriptorSupplier())
              .addMethod(getSetSprinklerTypeMethod())
              .addMethod(getActivateSprinklersMethod())
              .addMethod(getSetAutomaticIrrigationScheculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
