package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Unary RPCs where the client sends a single request to
 * the server and gets a single response back, just like
 * a normal function call.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClimateControlServiceGrpc {

  private ClimateControlServiceGrpc() {}

  public static final String SERVICE_NAME = "project.ClimateControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.ClimateRequest,
      my.project.MsgReply> getSetClimateParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setClimateParameters",
      requestType = my.project.ClimateRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.ClimateRequest,
      my.project.MsgReply> getSetClimateParametersMethod() {
    io.grpc.MethodDescriptor<my.project.ClimateRequest, my.project.MsgReply> getSetClimateParametersMethod;
    if ((getSetClimateParametersMethod = ClimateControlServiceGrpc.getSetClimateParametersMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getSetClimateParametersMethod = ClimateControlServiceGrpc.getSetClimateParametersMethod) == null) {
          ClimateControlServiceGrpc.getSetClimateParametersMethod = getSetClimateParametersMethod =
              io.grpc.MethodDescriptor.<my.project.ClimateRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setClimateParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.ClimateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("setClimateParameters"))
              .build();
        }
      }
    }
    return getSetClimateParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.ThresholdRequest,
      my.project.MsgReply> getSetThresholdAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setThresholdAlerts",
      requestType = my.project.ThresholdRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.ThresholdRequest,
      my.project.MsgReply> getSetThresholdAlertsMethod() {
    io.grpc.MethodDescriptor<my.project.ThresholdRequest, my.project.MsgReply> getSetThresholdAlertsMethod;
    if ((getSetThresholdAlertsMethod = ClimateControlServiceGrpc.getSetThresholdAlertsMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getSetThresholdAlertsMethod = ClimateControlServiceGrpc.getSetThresholdAlertsMethod) == null) {
          ClimateControlServiceGrpc.getSetThresholdAlertsMethod = getSetThresholdAlertsMethod =
              io.grpc.MethodDescriptor.<my.project.ThresholdRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setThresholdAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.ThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("setThresholdAlerts"))
              .build();
        }
      }
    }
    return getSetThresholdAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getActivateAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateAlerts",
      requestType = my.project.Empty.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getActivateAlertsMethod() {
    io.grpc.MethodDescriptor<my.project.Empty, my.project.MsgReply> getActivateAlertsMethod;
    if ((getActivateAlertsMethod = ClimateControlServiceGrpc.getActivateAlertsMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getActivateAlertsMethod = ClimateControlServiceGrpc.getActivateAlertsMethod) == null) {
          ClimateControlServiceGrpc.getActivateAlertsMethod = getActivateAlertsMethod =
              io.grpc.MethodDescriptor.<my.project.Empty, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "activateAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("activateAlerts"))
              .build();
        }
      }
    }
    return getActivateAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.ChangeClimateConditionsRequest,
      my.project.MsgReply> getChangeClimateConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeClimateConditions",
      requestType = my.project.ChangeClimateConditionsRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.ChangeClimateConditionsRequest,
      my.project.MsgReply> getChangeClimateConditionsMethod() {
    io.grpc.MethodDescriptor<my.project.ChangeClimateConditionsRequest, my.project.MsgReply> getChangeClimateConditionsMethod;
    if ((getChangeClimateConditionsMethod = ClimateControlServiceGrpc.getChangeClimateConditionsMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getChangeClimateConditionsMethod = ClimateControlServiceGrpc.getChangeClimateConditionsMethod) == null) {
          ClimateControlServiceGrpc.getChangeClimateConditionsMethod = getChangeClimateConditionsMethod =
              io.grpc.MethodDescriptor.<my.project.ChangeClimateConditionsRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeClimateConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.ChangeClimateConditionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("changeClimateConditions"))
              .build();
        }
      }
    }
    return getChangeClimateConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getActivateAutomaticClimateChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateAutomaticClimateChange",
      requestType = my.project.Empty.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getActivateAutomaticClimateChangeMethod() {
    io.grpc.MethodDescriptor<my.project.Empty, my.project.MsgReply> getActivateAutomaticClimateChangeMethod;
    if ((getActivateAutomaticClimateChangeMethod = ClimateControlServiceGrpc.getActivateAutomaticClimateChangeMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getActivateAutomaticClimateChangeMethod = ClimateControlServiceGrpc.getActivateAutomaticClimateChangeMethod) == null) {
          ClimateControlServiceGrpc.getActivateAutomaticClimateChangeMethod = getActivateAutomaticClimateChangeMethod =
              io.grpc.MethodDescriptor.<my.project.Empty, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "activateAutomaticClimateChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("activateAutomaticClimateChange"))
              .build();
        }
      }
    }
    return getActivateAutomaticClimateChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getGetCurrentClimateConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentClimateConditions",
      requestType = my.project.Empty.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getGetCurrentClimateConditionsMethod() {
    io.grpc.MethodDescriptor<my.project.Empty, my.project.MsgReply> getGetCurrentClimateConditionsMethod;
    if ((getGetCurrentClimateConditionsMethod = ClimateControlServiceGrpc.getGetCurrentClimateConditionsMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getGetCurrentClimateConditionsMethod = ClimateControlServiceGrpc.getGetCurrentClimateConditionsMethod) == null) {
          ClimateControlServiceGrpc.getGetCurrentClimateConditionsMethod = getGetCurrentClimateConditionsMethod =
              io.grpc.MethodDescriptor.<my.project.Empty, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCurrentClimateConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("getCurrentClimateConditions"))
              .build();
        }
      }
    }
    return getGetCurrentClimateConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.CurrentConfigurationRequest,
      my.project.MsgReply> getGetCurrentConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentConfiguration",
      requestType = my.project.CurrentConfigurationRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.CurrentConfigurationRequest,
      my.project.MsgReply> getGetCurrentConfigurationMethod() {
    io.grpc.MethodDescriptor<my.project.CurrentConfigurationRequest, my.project.MsgReply> getGetCurrentConfigurationMethod;
    if ((getGetCurrentConfigurationMethod = ClimateControlServiceGrpc.getGetCurrentConfigurationMethod) == null) {
      synchronized (ClimateControlServiceGrpc.class) {
        if ((getGetCurrentConfigurationMethod = ClimateControlServiceGrpc.getGetCurrentConfigurationMethod) == null) {
          ClimateControlServiceGrpc.getGetCurrentConfigurationMethod = getGetCurrentConfigurationMethod =
              io.grpc.MethodDescriptor.<my.project.CurrentConfigurationRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCurrentConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.CurrentConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateControlServiceMethodDescriptorSupplier("getCurrentConfiguration"))
              .build();
        }
      }
    }
    return getGetCurrentConfigurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClimateControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceStub>() {
        @java.lang.Override
        public ClimateControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceStub(channel, callOptions);
        }
      };
    return ClimateControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClimateControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceBlockingStub>() {
        @java.lang.Override
        public ClimateControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ClimateControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClimateControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateControlServiceFutureStub>() {
        @java.lang.Override
        public ClimateControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateControlServiceFutureStub(channel, callOptions);
        }
      };
    return ClimateControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void setClimateParameters(my.project.ClimateRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClimateParametersMethod(), responseObserver);
    }

    /**
     */
    default void setThresholdAlerts(my.project.ThresholdRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetThresholdAlertsMethod(), responseObserver);
    }

    /**
     */
    default void activateAlerts(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateAlertsMethod(), responseObserver);
    }

    /**
     */
    default void changeClimateConditions(my.project.ChangeClimateConditionsRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeClimateConditionsMethod(), responseObserver);
    }

    /**
     */
    default void activateAutomaticClimateChange(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateAutomaticClimateChangeMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentClimateConditions(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentClimateConditionsMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentConfiguration(my.project.CurrentConfigurationRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentConfigurationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClimateControlService.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static abstract class ClimateControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClimateControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClimateControlService.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class ClimateControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClimateControlServiceStub> {
    private ClimateControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void setClimateParameters(my.project.ClimateRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClimateParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setThresholdAlerts(my.project.ThresholdRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetThresholdAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activateAlerts(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeClimateConditions(my.project.ChangeClimateConditionsRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeClimateConditionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activateAutomaticClimateChange(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateAutomaticClimateChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentClimateConditions(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentClimateConditionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentConfiguration(my.project.CurrentConfigurationRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClimateControlService.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class ClimateControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClimateControlServiceBlockingStub> {
    private ClimateControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public my.project.MsgReply setClimateParameters(my.project.ClimateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClimateParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply setThresholdAlerts(my.project.ThresholdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetThresholdAlertsMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply activateAlerts(my.project.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateAlertsMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply changeClimateConditions(my.project.ChangeClimateConditionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeClimateConditionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply activateAutomaticClimateChange(my.project.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateAutomaticClimateChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply getCurrentClimateConditions(my.project.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentClimateConditionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply getCurrentConfiguration(my.project.CurrentConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClimateControlService.
   * <pre>
   * Unary RPCs where the client sends a single request to
   * the server and gets a single response back, just like
   * a normal function call.
   * </pre>
   */
  public static final class ClimateControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClimateControlServiceFutureStub> {
    private ClimateControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> setClimateParameters(
        my.project.ClimateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClimateParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> setThresholdAlerts(
        my.project.ThresholdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetThresholdAlertsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> activateAlerts(
        my.project.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateAlertsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> changeClimateConditions(
        my.project.ChangeClimateConditionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeClimateConditionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> activateAutomaticClimateChange(
        my.project.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateAutomaticClimateChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> getCurrentClimateConditions(
        my.project.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentClimateConditionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> getCurrentConfiguration(
        my.project.CurrentConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_CLIMATE_PARAMETERS = 0;
  private static final int METHODID_SET_THRESHOLD_ALERTS = 1;
  private static final int METHODID_ACTIVATE_ALERTS = 2;
  private static final int METHODID_CHANGE_CLIMATE_CONDITIONS = 3;
  private static final int METHODID_ACTIVATE_AUTOMATIC_CLIMATE_CHANGE = 4;
  private static final int METHODID_GET_CURRENT_CLIMATE_CONDITIONS = 5;
  private static final int METHODID_GET_CURRENT_CONFIGURATION = 6;

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
        case METHODID_SET_CLIMATE_PARAMETERS:
          serviceImpl.setClimateParameters((my.project.ClimateRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_SET_THRESHOLD_ALERTS:
          serviceImpl.setThresholdAlerts((my.project.ThresholdRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_ACTIVATE_ALERTS:
          serviceImpl.activateAlerts((my.project.Empty) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_CHANGE_CLIMATE_CONDITIONS:
          serviceImpl.changeClimateConditions((my.project.ChangeClimateConditionsRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_ACTIVATE_AUTOMATIC_CLIMATE_CHANGE:
          serviceImpl.activateAutomaticClimateChange((my.project.Empty) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_GET_CURRENT_CLIMATE_CONDITIONS:
          serviceImpl.getCurrentClimateConditions((my.project.Empty) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_GET_CURRENT_CONFIGURATION:
          serviceImpl.getCurrentConfiguration((my.project.CurrentConfigurationRequest) request,
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
          getSetClimateParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.ClimateRequest,
              my.project.MsgReply>(
                service, METHODID_SET_CLIMATE_PARAMETERS)))
        .addMethod(
          getSetThresholdAlertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.ThresholdRequest,
              my.project.MsgReply>(
                service, METHODID_SET_THRESHOLD_ALERTS)))
        .addMethod(
          getActivateAlertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.Empty,
              my.project.MsgReply>(
                service, METHODID_ACTIVATE_ALERTS)))
        .addMethod(
          getChangeClimateConditionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.ChangeClimateConditionsRequest,
              my.project.MsgReply>(
                service, METHODID_CHANGE_CLIMATE_CONDITIONS)))
        .addMethod(
          getActivateAutomaticClimateChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.Empty,
              my.project.MsgReply>(
                service, METHODID_ACTIVATE_AUTOMATIC_CLIMATE_CHANGE)))
        .addMethod(
          getGetCurrentClimateConditionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.Empty,
              my.project.MsgReply>(
                service, METHODID_GET_CURRENT_CLIMATE_CONDITIONS)))
        .addMethod(
          getGetCurrentConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.CurrentConfigurationRequest,
              my.project.MsgReply>(
                service, METHODID_GET_CURRENT_CONFIGURATION)))
        .build();
  }

  private static abstract class ClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClimateControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.MyProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClimateControlService");
    }
  }

  private static final class ClimateControlServiceFileDescriptorSupplier
      extends ClimateControlServiceBaseDescriptorSupplier {
    ClimateControlServiceFileDescriptorSupplier() {}
  }

  private static final class ClimateControlServiceMethodDescriptorSupplier
      extends ClimateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClimateControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClimateControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClimateControlServiceFileDescriptorSupplier())
              .addMethod(getSetClimateParametersMethod())
              .addMethod(getSetThresholdAlertsMethod())
              .addMethod(getActivateAlertsMethod())
              .addMethod(getChangeClimateConditionsMethod())
              .addMethod(getActivateAutomaticClimateChangeMethod())
              .addMethod(getGetCurrentClimateConditionsMethod())
              .addMethod(getGetCurrentConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
