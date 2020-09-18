package mailgun.kafkapixy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: kafkapixy.proto")
public final class KafkaPixyGrpc {

  private KafkaPixyGrpc() {}

  public static final String SERVICE_NAME = "KafkaPixy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProdRq,
      ProdRs> getProduceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Produce",
      requestType = ProdRq.class,
      responseType = ProdRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProdRq,
      ProdRs> getProduceMethod() {
    io.grpc.MethodDescriptor<ProdRq, ProdRs> getProduceMethod;
    if ((getProduceMethod = KafkaPixyGrpc.getProduceMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getProduceMethod = KafkaPixyGrpc.getProduceMethod) == null) {
          KafkaPixyGrpc.getProduceMethod = getProduceMethod =
              io.grpc.MethodDescriptor.<ProdRq, ProdRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Produce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProdRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProdRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("Produce"))
              .build();
        }
      }
    }
    return getProduceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ConsNAckRq,
      ConsRs> getConsumeNAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsumeNAck",
      requestType = ConsNAckRq.class,
      responseType = ConsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ConsNAckRq,
      ConsRs> getConsumeNAckMethod() {
    io.grpc.MethodDescriptor<ConsNAckRq, ConsRs> getConsumeNAckMethod;
    if ((getConsumeNAckMethod = KafkaPixyGrpc.getConsumeNAckMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getConsumeNAckMethod = KafkaPixyGrpc.getConsumeNAckMethod) == null) {
          KafkaPixyGrpc.getConsumeNAckMethod = getConsumeNAckMethod =
              io.grpc.MethodDescriptor.<ConsNAckRq, ConsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsumeNAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ConsNAckRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ConsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("ConsumeNAck"))
              .build();
        }
      }
    }
    return getConsumeNAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AckRq,
      AckRs> getAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ack",
      requestType = AckRq.class,
      responseType = AckRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AckRq,
      AckRs> getAckMethod() {
    io.grpc.MethodDescriptor<AckRq, AckRs> getAckMethod;
    if ((getAckMethod = KafkaPixyGrpc.getAckMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getAckMethod = KafkaPixyGrpc.getAckMethod) == null) {
          KafkaPixyGrpc.getAckMethod = getAckMethod =
              io.grpc.MethodDescriptor.<AckRq, AckRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AckRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AckRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("Ack"))
              .build();
        }
      }
    }
    return getAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetOffsetsRq,
      GetOffsetsRs> getGetOffsetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffsets",
      requestType = GetOffsetsRq.class,
      responseType = GetOffsetsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetOffsetsRq,
      GetOffsetsRs> getGetOffsetsMethod() {
    io.grpc.MethodDescriptor<GetOffsetsRq, GetOffsetsRs> getGetOffsetsMethod;
    if ((getGetOffsetsMethod = KafkaPixyGrpc.getGetOffsetsMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getGetOffsetsMethod = KafkaPixyGrpc.getGetOffsetsMethod) == null) {
          KafkaPixyGrpc.getGetOffsetsMethod = getGetOffsetsMethod =
              io.grpc.MethodDescriptor.<GetOffsetsRq, GetOffsetsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffsets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetOffsetsRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetOffsetsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("GetOffsets"))
              .build();
        }
      }
    }
    return getGetOffsetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SetOffsetsRq,
      SetOffsetsRs> getSetOffsetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOffsets",
      requestType = SetOffsetsRq.class,
      responseType = SetOffsetsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SetOffsetsRq,
      SetOffsetsRs> getSetOffsetsMethod() {
    io.grpc.MethodDescriptor<SetOffsetsRq, SetOffsetsRs> getSetOffsetsMethod;
    if ((getSetOffsetsMethod = KafkaPixyGrpc.getSetOffsetsMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getSetOffsetsMethod = KafkaPixyGrpc.getSetOffsetsMethod) == null) {
          KafkaPixyGrpc.getSetOffsetsMethod = getSetOffsetsMethod =
              io.grpc.MethodDescriptor.<SetOffsetsRq, SetOffsetsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOffsets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SetOffsetsRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SetOffsetsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("SetOffsets"))
              .build();
        }
      }
    }
    return getSetOffsetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListTopicRq,
      ListTopicRs> getListTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTopics",
      requestType = ListTopicRq.class,
      responseType = ListTopicRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ListTopicRq,
      ListTopicRs> getListTopicsMethod() {
    io.grpc.MethodDescriptor<ListTopicRq, ListTopicRs> getListTopicsMethod;
    if ((getListTopicsMethod = KafkaPixyGrpc.getListTopicsMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getListTopicsMethod = KafkaPixyGrpc.getListTopicsMethod) == null) {
          KafkaPixyGrpc.getListTopicsMethod = getListTopicsMethod =
              io.grpc.MethodDescriptor.<ListTopicRq, ListTopicRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTopics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListTopicRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListTopicRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("ListTopics"))
              .build();
        }
      }
    }
    return getListTopicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListConsumersRq,
      ListConsumersRs> getListConsumersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConsumers",
      requestType = ListConsumersRq.class,
      responseType = ListConsumersRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ListConsumersRq,
      ListConsumersRs> getListConsumersMethod() {
    io.grpc.MethodDescriptor<ListConsumersRq, ListConsumersRs> getListConsumersMethod;
    if ((getListConsumersMethod = KafkaPixyGrpc.getListConsumersMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getListConsumersMethod = KafkaPixyGrpc.getListConsumersMethod) == null) {
          KafkaPixyGrpc.getListConsumersMethod = getListConsumersMethod =
              io.grpc.MethodDescriptor.<ListConsumersRq, ListConsumersRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConsumers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListConsumersRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListConsumersRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("ListConsumers"))
              .build();
        }
      }
    }
    return getListConsumersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetTopicMetadataRq,
      GetTopicMetadataRs> getGetTopicMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopicMetadata",
      requestType = GetTopicMetadataRq.class,
      responseType = GetTopicMetadataRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetTopicMetadataRq,
      GetTopicMetadataRs> getGetTopicMetadataMethod() {
    io.grpc.MethodDescriptor<GetTopicMetadataRq, GetTopicMetadataRs> getGetTopicMetadataMethod;
    if ((getGetTopicMetadataMethod = KafkaPixyGrpc.getGetTopicMetadataMethod) == null) {
      synchronized (KafkaPixyGrpc.class) {
        if ((getGetTopicMetadataMethod = KafkaPixyGrpc.getGetTopicMetadataMethod) == null) {
          KafkaPixyGrpc.getGetTopicMetadataMethod = getGetTopicMetadataMethod =
              io.grpc.MethodDescriptor.<GetTopicMetadataRq, GetTopicMetadataRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopicMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTopicMetadataRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetTopicMetadataRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyMethodDescriptorSupplier("GetTopicMetadata"))
              .build();
        }
      }
    }
    return getGetTopicMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KafkaPixyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyStub>() {
        @Override
        public KafkaPixyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyStub(channel, callOptions);
        }
      };
    return KafkaPixyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KafkaPixyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyBlockingStub>() {
        @Override
        public KafkaPixyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyBlockingStub(channel, callOptions);
        }
      };
    return KafkaPixyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KafkaPixyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyFutureStub>() {
        @Override
        public KafkaPixyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyFutureStub(channel, callOptions);
        }
      };
    return KafkaPixyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KafkaPixyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void produce(ProdRq request,
                        io.grpc.stub.StreamObserver<ProdRs> responseObserver) {
      asyncUnimplementedUnaryCall(getProduceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void consumeNAck(ConsNAckRq request,
                            io.grpc.stub.StreamObserver<ConsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getConsumeNAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public void ack(AckRq request,
                    io.grpc.stub.StreamObserver<AckRs> responseObserver) {
      asyncUnimplementedUnaryCall(getAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void getOffsets(GetOffsetsRq request,
                           io.grpc.stub.StreamObserver<GetOffsetsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOffsetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void setOffsets(SetOffsetsRq request,
                           io.grpc.stub.StreamObserver<SetOffsetsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOffsetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listTopics(ListTopicRq request,
                           io.grpc.stub.StreamObserver<ListTopicRs> responseObserver) {
      asyncUnimplementedUnaryCall(getListTopicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listConsumers(ListConsumersRq request,
                              io.grpc.stub.StreamObserver<ListConsumersRs> responseObserver) {
      asyncUnimplementedUnaryCall(getListConsumersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public void getTopicMetadata(GetTopicMetadataRq request,
                                 io.grpc.stub.StreamObserver<GetTopicMetadataRs> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopicMetadataMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProduceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ProdRq,
                ProdRs>(
                  this, METHODID_PRODUCE)))
          .addMethod(
            getConsumeNAckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ConsNAckRq,
                ConsRs>(
                  this, METHODID_CONSUME_NACK)))
          .addMethod(
            getAckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AckRq,
                AckRs>(
                  this, METHODID_ACK)))
          .addMethod(
            getGetOffsetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetOffsetsRq,
                GetOffsetsRs>(
                  this, METHODID_GET_OFFSETS)))
          .addMethod(
            getSetOffsetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SetOffsetsRq,
                SetOffsetsRs>(
                  this, METHODID_SET_OFFSETS)))
          .addMethod(
            getListTopicsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ListTopicRq,
                ListTopicRs>(
                  this, METHODID_LIST_TOPICS)))
          .addMethod(
            getListConsumersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ListConsumersRq,
                ListConsumersRs>(
                  this, METHODID_LIST_CONSUMERS)))
          .addMethod(
            getGetTopicMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetTopicMetadataRq,
                GetTopicMetadataRs>(
                  this, METHODID_GET_TOPIC_METADATA)))
          .build();
    }
  }

  /**
   */
  public static final class KafkaPixyStub extends io.grpc.stub.AbstractAsyncStub<KafkaPixyStub> {
    private KafkaPixyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KafkaPixyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void produce(ProdRq request,
                        io.grpc.stub.StreamObserver<ProdRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void consumeNAck(ConsNAckRq request,
                            io.grpc.stub.StreamObserver<ConsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsumeNAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public void ack(AckRq request,
                    io.grpc.stub.StreamObserver<AckRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void getOffsets(GetOffsetsRq request,
                           io.grpc.stub.StreamObserver<GetOffsetsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOffsetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void setOffsets(SetOffsetsRq request,
                           io.grpc.stub.StreamObserver<SetOffsetsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOffsetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listTopics(ListTopicRq request,
                           io.grpc.stub.StreamObserver<ListTopicRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTopicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listConsumers(ListConsumersRq request,
                              io.grpc.stub.StreamObserver<ListConsumersRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConsumersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public void getTopicMetadata(GetTopicMetadataRq request,
                                 io.grpc.stub.StreamObserver<GetTopicMetadataRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopicMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KafkaPixyBlockingStub extends io.grpc.stub.AbstractBlockingStub<KafkaPixyBlockingStub> {
    private KafkaPixyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KafkaPixyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public ProdRs produce(ProdRq request) {
      return blockingUnaryCall(
          getChannel(), getProduceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public ConsRs consumeNAck(ConsNAckRq request) {
      return blockingUnaryCall(
          getChannel(), getConsumeNAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public AckRs ack(AckRq request) {
      return blockingUnaryCall(
          getChannel(), getAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public GetOffsetsRs getOffsets(GetOffsetsRq request) {
      return blockingUnaryCall(
          getChannel(), getGetOffsetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public SetOffsetsRs setOffsets(SetOffsetsRq request) {
      return blockingUnaryCall(
          getChannel(), getSetOffsetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public ListTopicRs listTopics(ListTopicRq request) {
      return blockingUnaryCall(
          getChannel(), getListTopicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public ListConsumersRs listConsumers(ListConsumersRq request) {
      return blockingUnaryCall(
          getChannel(), getListConsumersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public GetTopicMetadataRs getTopicMetadata(GetTopicMetadataRq request) {
      return blockingUnaryCall(
          getChannel(), getGetTopicMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KafkaPixyFutureStub extends io.grpc.stub.AbstractFutureStub<KafkaPixyFutureStub> {
    private KafkaPixyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected KafkaPixyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ProdRs> produce(
        ProdRq request) {
      return futureUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ConsRs> consumeNAck(
        ConsNAckRq request) {
      return futureUnaryCall(
          getChannel().newCall(getConsumeNAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AckRs> ack(
        AckRq request) {
      return futureUnaryCall(
          getChannel().newCall(getAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetOffsetsRs> getOffsets(
        GetOffsetsRq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOffsetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SetOffsetsRs> setOffsets(
        SetOffsetsRq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOffsetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ListTopicRs> listTopics(
        ListTopicRq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTopicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ListConsumersRs> listConsumers(
        ListConsumersRq request) {
      return futureUnaryCall(
          getChannel().newCall(getListConsumersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetTopicMetadataRs> getTopicMetadata(
        GetTopicMetadataRq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopicMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCE = 0;
  private static final int METHODID_CONSUME_NACK = 1;
  private static final int METHODID_ACK = 2;
  private static final int METHODID_GET_OFFSETS = 3;
  private static final int METHODID_SET_OFFSETS = 4;
  private static final int METHODID_LIST_TOPICS = 5;
  private static final int METHODID_LIST_CONSUMERS = 6;
  private static final int METHODID_GET_TOPIC_METADATA = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KafkaPixyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KafkaPixyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCE:
          serviceImpl.produce((ProdRq) request,
              (io.grpc.stub.StreamObserver<ProdRs>) responseObserver);
          break;
        case METHODID_CONSUME_NACK:
          serviceImpl.consumeNAck((ConsNAckRq) request,
              (io.grpc.stub.StreamObserver<ConsRs>) responseObserver);
          break;
        case METHODID_ACK:
          serviceImpl.ack((AckRq) request,
              (io.grpc.stub.StreamObserver<AckRs>) responseObserver);
          break;
        case METHODID_GET_OFFSETS:
          serviceImpl.getOffsets((GetOffsetsRq) request,
              (io.grpc.stub.StreamObserver<GetOffsetsRs>) responseObserver);
          break;
        case METHODID_SET_OFFSETS:
          serviceImpl.setOffsets((SetOffsetsRq) request,
              (io.grpc.stub.StreamObserver<SetOffsetsRs>) responseObserver);
          break;
        case METHODID_LIST_TOPICS:
          serviceImpl.listTopics((ListTopicRq) request,
              (io.grpc.stub.StreamObserver<ListTopicRs>) responseObserver);
          break;
        case METHODID_LIST_CONSUMERS:
          serviceImpl.listConsumers((ListConsumersRq) request,
              (io.grpc.stub.StreamObserver<ListConsumersRs>) responseObserver);
          break;
        case METHODID_GET_TOPIC_METADATA:
          serviceImpl.getTopicMetadata((GetTopicMetadataRq) request,
              (io.grpc.stub.StreamObserver<GetTopicMetadataRs>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KafkaPixyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KafkaPixyBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return KafkaPixyProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KafkaPixy");
    }
  }

  private static final class KafkaPixyFileDescriptorSupplier
      extends KafkaPixyBaseDescriptorSupplier {
    KafkaPixyFileDescriptorSupplier() {}
  }

  private static final class KafkaPixyMethodDescriptorSupplier
      extends KafkaPixyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KafkaPixyMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KafkaPixyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KafkaPixyFileDescriptorSupplier())
              .addMethod(getProduceMethod())
              .addMethod(getConsumeNAckMethod())
              .addMethod(getAckMethod())
              .addMethod(getGetOffsetsMethod())
              .addMethod(getSetOffsetsMethod())
              .addMethod(getListTopicsMethod())
              .addMethod(getListConsumersMethod())
              .addMethod(getGetTopicMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
