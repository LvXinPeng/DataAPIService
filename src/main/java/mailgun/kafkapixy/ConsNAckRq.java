// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * Protobuf type {@code ConsNAckRq}
 */
public final class ConsNAckRq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsNAckRq)
        ConsNAckRqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsNAckRq.newBuilder() to construct.
  private ConsNAckRq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsNAckRq() {
    cluster_ = "";
    topic_ = "";
    group_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsNAckRq();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsNAckRq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            cluster_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            group_ = s;
            break;
          }
          case 32: {

            noAck_ = input.readBool();
            break;
          }
          case 40: {

            autoAck_ = input.readBool();
            break;
          }
          case 48: {

            ackPartition_ = input.readInt32();
            break;
          }
          case 56: {

            ackOffset_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return KafkaPixyProto.internal_static_ConsNAckRq_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return KafkaPixyProto.internal_static_ConsNAckRq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ConsNAckRq.class, Builder.class);
  }

  public static final int CLUSTER_FIELD_NUMBER = 1;
  private volatile Object cluster_;
  /**
   * <pre>
   * Name of a Kafka cluster to operate on.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The cluster.
   */
  @Override
  public String getCluster() {
    Object ref = cluster_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      cluster_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of a Kafka cluster to operate on.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The bytes for cluster.
   */
  @Override
  public com.google.protobuf.ByteString
      getClusterBytes() {
    Object ref = cluster_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      cluster_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private volatile Object topic_;
  /**
   * <pre>
   * Name of a topic to produce to.
   * </pre>
   *
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  @Override
  public String getTopic() {
    Object ref = topic_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of a topic to produce to.
   * </pre>
   *
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  @Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    Object ref = topic_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_FIELD_NUMBER = 3;
  private volatile Object group_;
  /**
   * <pre>
   * Name of a consumer group.
   * </pre>
   *
   * <code>string group = 3;</code>
   * @return The group.
   */
  @Override
  public String getGroup() {
    Object ref = group_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of a consumer group.
   * </pre>
   *
   * <code>string group = 3;</code>
   * @return The bytes for group.
   */
  @Override
  public com.google.protobuf.ByteString
      getGroupBytes() {
    Object ref = group_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      group_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NO_ACK_FIELD_NUMBER = 4;
  private boolean noAck_;
  /**
   * <pre>
   * If true then no message is acknowledged by the request.
   * </pre>
   *
   * <code>bool no_ack = 4;</code>
   * @return The noAck.
   */
  @Override
  public boolean getNoAck() {
    return noAck_;
  }

  public static final int AUTO_ACK_FIELD_NUMBER = 5;
  private boolean autoAck_;
  /**
   * <pre>
   * If true and no_ack is false then the message returned by the requests is
   * automatically acknowledged by Kafka-Pixy before the request completes.
   * </pre>
   *
   * <code>bool auto_ack = 5;</code>
   * @return The autoAck.
   */
  @Override
  public boolean getAutoAck() {
    return autoAck_;
  }

  public static final int ACK_PARTITION_FIELD_NUMBER = 6;
  private int ackPartition_;
  /**
   * <pre>
   * If both no_ack and auto_ack are false (by default), then ack_partition
   * and ack_offset along with cluster-group-topic determine the message that
   * should be acknowledged by the request.
   * </pre>
   *
   * <code>int32 ack_partition = 6;</code>
   * @return The ackPartition.
   */
  @Override
  public int getAckPartition() {
    return ackPartition_;
  }

  public static final int ACK_OFFSET_FIELD_NUMBER = 7;
  private long ackOffset_;
  /**
   * <code>int64 ack_offset = 7;</code>
   * @return The ackOffset.
   */
  @Override
  public long getAckOffset() {
    return ackOffset_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getClusterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cluster_);
    }
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topic_);
    }
    if (!getGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, group_);
    }
    if (noAck_ != false) {
      output.writeBool(4, noAck_);
    }
    if (autoAck_ != false) {
      output.writeBool(5, autoAck_);
    }
    if (ackPartition_ != 0) {
      output.writeInt32(6, ackPartition_);
    }
    if (ackOffset_ != 0L) {
      output.writeInt64(7, ackOffset_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClusterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topic_);
    }
    if (!getGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, group_);
    }
    if (noAck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, noAck_);
    }
    if (autoAck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, autoAck_);
    }
    if (ackPartition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, ackPartition_);
    }
    if (ackOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, ackOffset_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ConsNAckRq)) {
      return super.equals(obj);
    }
    ConsNAckRq other = (ConsNAckRq) obj;

    if (!getCluster()
        .equals(other.getCluster())) return false;
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (!getGroup()
        .equals(other.getGroup())) return false;
    if (getNoAck()
        != other.getNoAck()) return false;
    if (getAutoAck()
        != other.getAutoAck()) return false;
    if (getAckPartition()
        != other.getAckPartition()) return false;
    if (getAckOffset()
        != other.getAckOffset()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + getCluster().hashCode();
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (37 * hash) + NO_ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNoAck());
    hash = (37 * hash) + AUTO_ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoAck());
    hash = (37 * hash) + ACK_PARTITION_FIELD_NUMBER;
    hash = (53 * hash) + getAckPartition();
    hash = (37 * hash) + ACK_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAckOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ConsNAckRq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsNAckRq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsNAckRq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsNAckRq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsNAckRq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsNAckRq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsNAckRq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsNAckRq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsNAckRq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ConsNAckRq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsNAckRq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsNAckRq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ConsNAckRq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ConsNAckRq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsNAckRq)
      ConsNAckRqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return KafkaPixyProto.internal_static_ConsNAckRq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return KafkaPixyProto.internal_static_ConsNAckRq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConsNAckRq.class, Builder.class);
    }

    // Construct using mailgun.kafkapixy.ConsNAckRq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      cluster_ = "";

      topic_ = "";

      group_ = "";

      noAck_ = false;

      autoAck_ = false;

      ackPartition_ = 0;

      ackOffset_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return KafkaPixyProto.internal_static_ConsNAckRq_descriptor;
    }

    @Override
    public ConsNAckRq getDefaultInstanceForType() {
      return ConsNAckRq.getDefaultInstance();
    }

    @Override
    public ConsNAckRq build() {
      ConsNAckRq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ConsNAckRq buildPartial() {
      ConsNAckRq result = new ConsNAckRq(this);
      result.cluster_ = cluster_;
      result.topic_ = topic_;
      result.group_ = group_;
      result.noAck_ = noAck_;
      result.autoAck_ = autoAck_;
      result.ackPartition_ = ackPartition_;
      result.ackOffset_ = ackOffset_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ConsNAckRq) {
        return mergeFrom((ConsNAckRq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ConsNAckRq other) {
      if (other == ConsNAckRq.getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        onChanged();
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        onChanged();
      }
      if (other.getNoAck() != false) {
        setNoAck(other.getNoAck());
      }
      if (other.getAutoAck() != false) {
        setAutoAck(other.getAutoAck());
      }
      if (other.getAckPartition() != 0) {
        setAckPartition(other.getAckPartition());
      }
      if (other.getAckOffset() != 0L) {
        setAckOffset(other.getAckOffset());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ConsNAckRq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ConsNAckRq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object cluster_ = "";
    /**
     * <pre>
     * Name of a Kafka cluster to operate on.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return The cluster.
     */
    public String getCluster() {
      Object ref = cluster_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        cluster_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of a Kafka cluster to operate on.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return The bytes for cluster.
     */
    public com.google.protobuf.ByteString
        getClusterBytes() {
      Object ref = cluster_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        cluster_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of a Kafka cluster to operate on.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @param value The cluster to set.
     * @return This builder for chaining.
     */
    public Builder setCluster(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      cluster_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a Kafka cluster to operate on.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCluster() {

      cluster_ = getDefaultInstance().getCluster();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a Kafka cluster to operate on.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @param value The bytes for cluster to set.
     * @return This builder for chaining.
     */
    public Builder setClusterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      cluster_ = value;
      onChanged();
      return this;
    }

    private Object topic_ = "";
    /**
     * <pre>
     * Name of a topic to produce to.
     * </pre>
     *
     * <code>string topic = 2;</code>
     * @return The topic.
     */
    public String getTopic() {
      Object ref = topic_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of a topic to produce to.
     * </pre>
     *
     * <code>string topic = 2;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of a topic to produce to.
     * </pre>
     *
     * <code>string topic = 2;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a topic to produce to.
     * </pre>
     *
     * <code>string topic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {

      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a topic to produce to.
     * </pre>
     *
     * <code>string topic = 2;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      topic_ = value;
      onChanged();
      return this;
    }

    private Object group_ = "";
    /**
     * <pre>
     * Name of a consumer group.
     * </pre>
     *
     * <code>string group = 3;</code>
     * @return The group.
     */
    public String getGroup() {
      Object ref = group_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of a consumer group.
     * </pre>
     *
     * <code>string group = 3;</code>
     * @return The bytes for group.
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of a consumer group.
     * </pre>
     *
     * <code>string group = 3;</code>
     * @param value The group to set.
     * @return This builder for chaining.
     */
    public Builder setGroup(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      group_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a consumer group.
     * </pre>
     *
     * <code>string group = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroup() {

      group_ = getDefaultInstance().getGroup();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of a consumer group.
     * </pre>
     *
     * <code>string group = 3;</code>
     * @param value The bytes for group to set.
     * @return This builder for chaining.
     */
    public Builder setGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      group_ = value;
      onChanged();
      return this;
    }

    private boolean noAck_ ;
    /**
     * <pre>
     * If true then no message is acknowledged by the request.
     * </pre>
     *
     * <code>bool no_ack = 4;</code>
     * @return The noAck.
     */
    @Override
    public boolean getNoAck() {
      return noAck_;
    }
    /**
     * <pre>
     * If true then no message is acknowledged by the request.
     * </pre>
     *
     * <code>bool no_ack = 4;</code>
     * @param value The noAck to set.
     * @return This builder for chaining.
     */
    public Builder setNoAck(boolean value) {

      noAck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true then no message is acknowledged by the request.
     * </pre>
     *
     * <code>bool no_ack = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNoAck() {

      noAck_ = false;
      onChanged();
      return this;
    }

    private boolean autoAck_ ;
    /**
     * <pre>
     * If true and no_ack is false then the message returned by the requests is
     * automatically acknowledged by Kafka-Pixy before the request completes.
     * </pre>
     *
     * <code>bool auto_ack = 5;</code>
     * @return The autoAck.
     */
    @Override
    public boolean getAutoAck() {
      return autoAck_;
    }
    /**
     * <pre>
     * If true and no_ack is false then the message returned by the requests is
     * automatically acknowledged by Kafka-Pixy before the request completes.
     * </pre>
     *
     * <code>bool auto_ack = 5;</code>
     * @param value The autoAck to set.
     * @return This builder for chaining.
     */
    public Builder setAutoAck(boolean value) {

      autoAck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true and no_ack is false then the message returned by the requests is
     * automatically acknowledged by Kafka-Pixy before the request completes.
     * </pre>
     *
     * <code>bool auto_ack = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoAck() {

      autoAck_ = false;
      onChanged();
      return this;
    }

    private int ackPartition_ ;
    /**
     * <pre>
     * If both no_ack and auto_ack are false (by default), then ack_partition
     * and ack_offset along with cluster-group-topic determine the message that
     * should be acknowledged by the request.
     * </pre>
     *
     * <code>int32 ack_partition = 6;</code>
     * @return The ackPartition.
     */
    @Override
    public int getAckPartition() {
      return ackPartition_;
    }
    /**
     * <pre>
     * If both no_ack and auto_ack are false (by default), then ack_partition
     * and ack_offset along with cluster-group-topic determine the message that
     * should be acknowledged by the request.
     * </pre>
     *
     * <code>int32 ack_partition = 6;</code>
     * @param value The ackPartition to set.
     * @return This builder for chaining.
     */
    public Builder setAckPartition(int value) {

      ackPartition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If both no_ack and auto_ack are false (by default), then ack_partition
     * and ack_offset along with cluster-group-topic determine the message that
     * should be acknowledged by the request.
     * </pre>
     *
     * <code>int32 ack_partition = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAckPartition() {

      ackPartition_ = 0;
      onChanged();
      return this;
    }

    private long ackOffset_ ;
    /**
     * <code>int64 ack_offset = 7;</code>
     * @return The ackOffset.
     */
    @Override
    public long getAckOffset() {
      return ackOffset_;
    }
    /**
     * <code>int64 ack_offset = 7;</code>
     * @param value The ackOffset to set.
     * @return This builder for chaining.
     */
    public Builder setAckOffset(long value) {

      ackOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ack_offset = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearAckOffset() {

      ackOffset_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ConsNAckRq)
  }

  // @@protoc_insertion_point(class_scope:ConsNAckRq)
  private static final ConsNAckRq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ConsNAckRq();
  }

  public static ConsNAckRq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsNAckRq>
      PARSER = new com.google.protobuf.AbstractParser<ConsNAckRq>() {
    @Override
    public ConsNAckRq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsNAckRq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsNAckRq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ConsNAckRq> getParserForType() {
    return PARSER;
  }

  @Override
  public ConsNAckRq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

