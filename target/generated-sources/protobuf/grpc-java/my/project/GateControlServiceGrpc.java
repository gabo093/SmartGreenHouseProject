package my.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GateControlServiceGrpc {

  private GateControlServiceGrpc() {}

  public static final String SERVICE_NAME = "project.GateControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.project.GatesRequest,
      my.project.MsgReply> getSetupGatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setupGates",
      requestType = my.project.GatesRequest.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.GatesRequest,
      my.project.MsgReply> getSetupGatesMethod() {
    io.grpc.MethodDescriptor<my.project.GatesRequest, my.project.MsgReply> getSetupGatesMethod;
    if ((getSetupGatesMethod = GateControlServiceGrpc.getSetupGatesMethod) == null) {
      synchronized (GateControlServiceGrpc.class) {
        if ((getSetupGatesMethod = GateControlServiceGrpc.getSetupGatesMethod) == null) {
          GateControlServiceGrpc.getSetupGatesMethod = getSetupGatesMethod =
              io.grpc.MethodDescriptor.<my.project.GatesRequest, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setupGates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.GatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new GateControlServiceMethodDescriptorSupplier("setupGates"))
              .build();
        }
      }
    }
    return getSetupGatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getGetGatesInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGatesInformation",
      requestType = my.project.Empty.class,
      responseType = my.project.MsgReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.project.Empty,
      my.project.MsgReply> getGetGatesInformationMethod() {
    io.grpc.MethodDescriptor<my.project.Empty, my.project.MsgReply> getGetGatesInformationMethod;
    if ((getGetGatesInformationMethod = GateControlServiceGrpc.getGetGatesInformationMethod) == null) {
      synchronized (GateControlServiceGrpc.class) {
        if ((getGetGatesInformationMethod = GateControlServiceGrpc.getGetGatesInformationMethod) == null) {
          GateControlServiceGrpc.getGetGatesInformationMethod = getGetGatesInformationMethod =
              io.grpc.MethodDescriptor.<my.project.Empty, my.project.MsgReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGatesInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.project.MsgReply.getDefaultInstance()))
              .setSchemaDescriptor(new GateControlServiceMethodDescriptorSupplier("getGatesInformation"))
              .build();
        }
      }
    }
    return getGetGatesInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GateControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GateControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GateControlServiceStub>() {
        @java.lang.Override
        public GateControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GateControlServiceStub(channel, callOptions);
        }
      };
    return GateControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GateControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GateControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GateControlServiceBlockingStub>() {
        @java.lang.Override
        public GateControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GateControlServiceBlockingStub(channel, callOptions);
        }
      };
    return GateControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GateControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GateControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GateControlServiceFutureStub>() {
        @java.lang.Override
        public GateControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GateControlServiceFutureStub(channel, callOptions);
        }
      };
    return GateControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    default void setupGates(my.project.GatesRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupGatesMethod(), responseObserver);
    }

    /**
     */
    default void getGatesInformation(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGatesInformationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GateControlService.
   */
  public static abstract class GateControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GateControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GateControlService.
   */
  public static final class GateControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GateControlServiceStub> {
    private GateControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GateControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    public void setupGates(my.project.GatesRequest request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupGatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGatesInformation(my.project.Empty request,
        io.grpc.stub.StreamObserver<my.project.MsgReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGatesInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GateControlService.
   */
  public static final class GateControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GateControlServiceBlockingStub> {
    private GateControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GateControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    public my.project.MsgReply setupGates(my.project.GatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupGatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.project.MsgReply getGatesInformation(my.project.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGatesInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GateControlService.
   */
  public static final class GateControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GateControlServiceFutureStub> {
    private GateControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GateControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPCs where both sides send a
     * sequence of messages using a read-write stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> setupGates(
        my.project.GatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupGatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.project.MsgReply> getGatesInformation(
        my.project.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGatesInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SETUP_GATES = 0;
  private static final int METHODID_GET_GATES_INFORMATION = 1;

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
        case METHODID_SETUP_GATES:
          serviceImpl.setupGates((my.project.GatesRequest) request,
              (io.grpc.stub.StreamObserver<my.project.MsgReply>) responseObserver);
          break;
        case METHODID_GET_GATES_INFORMATION:
          serviceImpl.getGatesInformation((my.project.Empty) request,
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
          getSetupGatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.GatesRequest,
              my.project.MsgReply>(
                service, METHODID_SETUP_GATES)))
        .addMethod(
          getGetGatesInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              my.project.Empty,
              my.project.MsgReply>(
                service, METHODID_GET_GATES_INFORMATION)))
        .build();
  }

  private static abstract class GateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GateControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.project.MyProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GateControlService");
    }
  }

  private static final class GateControlServiceFileDescriptorSupplier
      extends GateControlServiceBaseDescriptorSupplier {
    GateControlServiceFileDescriptorSupplier() {}
  }

  private static final class GateControlServiceMethodDescriptorSupplier
      extends GateControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GateControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GateControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GateControlServiceFileDescriptorSupplier())
              .addMethod(getSetupGatesMethod())
              .addMethod(getGetGatesInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
