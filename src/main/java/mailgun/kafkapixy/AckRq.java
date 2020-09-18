// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * Protobuf type {@code AckRq}
 */
public final class AckRq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AckRq)
    AckRqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AckRq.newBuilder() to construct.
  private AckRq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AckRq() {
    cluster_ = "";
    topic_ = "";
    group_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AckRq();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AckRq(
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

            partition_ = input.readInt32();
            break;
          }
          case 40: {

            offset_ = input.readInt64();
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
    return KafkaPixyProto.internal_static_AckRq_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return KafkaPixyProto.internal_static_AckRq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AckRq.class, Builder.class);
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

  public static final int PARTITION_FIELD_NUMBER = 4;
  private int partition_;
  /**
   * <pre>
   * Partition that the acknowledged message was consumed from.
   * </pre>
   *
   * <code>int32 partition = 4;</code>
   * @return The partition.
   */
  @Override
  public int getPartition() {
    return partition_;
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  private long offset_;
  /**
   * <pre>
   * Offset in the partition that the acknowledged message was consumed from.
   * </pre>
   *
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  @Override
  public long getOffset() {
    return offset_;
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
    if (partition_ != 0) {
      output.writeInt32(4, partition_);
    }
    if (offset_ != 0L) {
      output.writeInt64(5, offset_);
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
    if (partition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, partition_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, offset_);
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
    if (!(obj instanceof AckRq)) {
      return super.equals(obj);
    }
    AckRq other = (AckRq) obj;

    if (!getCluster()
        .equals(other.getCluster())) return false;
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (!getGroup()
        .equals(other.getGroup())) return false;
    if (getPartition()
        != other.getPartition()) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    hash = (37 * hash) + PARTITION_FIELD_NUMBER;
    hash = (53 * hash) + getPartition();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AckRq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AckRq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AckRq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AckRq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AckRq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AckRq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AckRq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AckRq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AckRq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AckRq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AckRq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AckRq parseFrom(
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
  public static Builder newBuilder(AckRq prototype) {
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
   * Protobuf type {@code AckRq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AckRq)
      AckRqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return KafkaPixyProto.internal_static_AckRq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return KafkaPixyProto.internal_static_AckRq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AckRq.class, Builder.class);
    }

    // Construct using mailgun.kafkapixy.AckRq.newBuilder()
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

      partition_ = 0;

      offset_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return KafkaPixyProto.internal_static_AckRq_descriptor;
    }

    @Override
    public AckRq getDefaultInstanceForType() {
      return AckRq.getDefaultInstance();
    }

    @Override
    public AckRq build() {
      AckRq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AckRq buildPartial() {
      AckRq result = new AckRq(this);
      result.cluster_ = cluster_;
      result.topic_ = topic_;
      result.group_ = group_;
      result.partition_ = partition_;
      result.offset_ = offset_;
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
      if (other instanceof AckRq) {
        return mergeFrom((AckRq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AckRq other) {
      if (other == AckRq.getDefaultInstance()) return this;
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
      if (other.getPartition() != 0) {
        setPartition(other.getPartition());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
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
      AckRq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AckRq) e.getUnfinishedMessage();
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

    private int partition_ ;
    /**
     * <pre>
     * Partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int32 partition = 4;</code>
     * @return The partition.
     */
    @Override
    public int getPartition() {
      return partition_;
    }
    /**
     * <pre>
     * Partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int32 partition = 4;</code>
     * @param value The partition to set.
     * @return This builder for chaining.
     */
    public Builder setPartition(int value) {

      partition_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int32 partition = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartition() {

      partition_ = 0;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <pre>
     * Offset in the partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int64 offset = 5;</code>
     * @return The offset.
     */
    @Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * Offset in the partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int64 offset = 5;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset in the partition that the acknowledged message was consumed from.
     * </pre>
     *
     * <code>int64 offset = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {

      offset_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:AckRq)
  }

  // @@protoc_insertion_point(class_scope:AckRq)
  private static final AckRq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AckRq();
  }

  public static AckRq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AckRq>
      PARSER = new com.google.protobuf.AbstractParser<AckRq>() {
    @Override
    public AckRq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AckRq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AckRq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AckRq> getParserForType() {
    return PARSER;
  }

  @Override
  public AckRq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

