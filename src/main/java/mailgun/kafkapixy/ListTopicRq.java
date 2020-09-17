// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * Protobuf type {@code ListTopicRq}
 */
public final class ListTopicRq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListTopicRq)
    ListTopicRqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTopicRq.newBuilder() to construct.
  private ListTopicRq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTopicRq() {
    cluster_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTopicRq();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTopicRq(
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
          case 16: {

            withPartitions_ = input.readBool();
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
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_ListTopicRq_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_ListTopicRq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mailgun.kafkapixy.ListTopicRq.class, mailgun.kafkapixy.ListTopicRq.Builder.class);
  }

  public static final int CLUSTER_FIELD_NUMBER = 1;
  private volatile Object cluster_;
  /**
   * <pre>
   * Name of a Kafka cluster
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
   * Name of a Kafka cluster
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

  public static final int WITH_PARTITIONS_FIELD_NUMBER = 2;
  private boolean withPartitions_;
  /**
   * <pre>
   * Should include partition metadata
   * </pre>
   *
   * <code>bool with_partitions = 2;</code>
   * @return The withPartitions.
   */
  @Override
  public boolean getWithPartitions() {
    return withPartitions_;
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
    if (withPartitions_ != false) {
      output.writeBool(2, withPartitions_);
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
    if (withPartitions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, withPartitions_);
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
    if (!(obj instanceof mailgun.kafkapixy.ListTopicRq)) {
      return super.equals(obj);
    }
    mailgun.kafkapixy.ListTopicRq other = (mailgun.kafkapixy.ListTopicRq) obj;

    if (!getCluster()
        .equals(other.getCluster())) return false;
    if (getWithPartitions()
        != other.getWithPartitions()) return false;
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
    hash = (37 * hash) + WITH_PARTITIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithPartitions());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.ListTopicRq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ListTopicRq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ListTopicRq parseFrom(
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
  public static Builder newBuilder(mailgun.kafkapixy.ListTopicRq prototype) {
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
   * Protobuf type {@code ListTopicRq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListTopicRq)
      mailgun.kafkapixy.ListTopicRqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ListTopicRq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ListTopicRq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mailgun.kafkapixy.ListTopicRq.class, mailgun.kafkapixy.ListTopicRq.Builder.class);
    }

    // Construct using mailgun.kafkapixy.ListTopicRq.newBuilder()
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

      withPartitions_ = false;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ListTopicRq_descriptor;
    }

    @Override
    public mailgun.kafkapixy.ListTopicRq getDefaultInstanceForType() {
      return mailgun.kafkapixy.ListTopicRq.getDefaultInstance();
    }

    @Override
    public mailgun.kafkapixy.ListTopicRq build() {
      mailgun.kafkapixy.ListTopicRq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public mailgun.kafkapixy.ListTopicRq buildPartial() {
      mailgun.kafkapixy.ListTopicRq result = new mailgun.kafkapixy.ListTopicRq(this);
      result.cluster_ = cluster_;
      result.withPartitions_ = withPartitions_;
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
      if (other instanceof mailgun.kafkapixy.ListTopicRq) {
        return mergeFrom((mailgun.kafkapixy.ListTopicRq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mailgun.kafkapixy.ListTopicRq other) {
      if (other == mailgun.kafkapixy.ListTopicRq.getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        onChanged();
      }
      if (other.getWithPartitions() != false) {
        setWithPartitions(other.getWithPartitions());
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
      mailgun.kafkapixy.ListTopicRq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mailgun.kafkapixy.ListTopicRq) e.getUnfinishedMessage();
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
     * Name of a Kafka cluster
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
     * Name of a Kafka cluster
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
     * Name of a Kafka cluster
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
     * Name of a Kafka cluster
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
     * Name of a Kafka cluster
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

    private boolean withPartitions_ ;
    /**
     * <pre>
     * Should include partition metadata
     * </pre>
     *
     * <code>bool with_partitions = 2;</code>
     * @return The withPartitions.
     */
    @Override
    public boolean getWithPartitions() {
      return withPartitions_;
    }
    /**
     * <pre>
     * Should include partition metadata
     * </pre>
     *
     * <code>bool with_partitions = 2;</code>
     * @param value The withPartitions to set.
     * @return This builder for chaining.
     */
    public Builder setWithPartitions(boolean value) {

      withPartitions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Should include partition metadata
     * </pre>
     *
     * <code>bool with_partitions = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithPartitions() {

      withPartitions_ = false;
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


    // @@protoc_insertion_point(builder_scope:ListTopicRq)
  }

  // @@protoc_insertion_point(class_scope:ListTopicRq)
  private static final mailgun.kafkapixy.ListTopicRq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mailgun.kafkapixy.ListTopicRq();
  }

  public static mailgun.kafkapixy.ListTopicRq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTopicRq>
      PARSER = new com.google.protobuf.AbstractParser<ListTopicRq>() {
    @Override
    public ListTopicRq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTopicRq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTopicRq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListTopicRq> getParserForType() {
    return PARSER;
  }

  @Override
  public mailgun.kafkapixy.ListTopicRq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
