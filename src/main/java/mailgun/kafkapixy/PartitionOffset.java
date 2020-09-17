// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * Protobuf type {@code PartitionOffset}
 */
public final class PartitionOffset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PartitionOffset)
        PartitionOffsetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionOffset.newBuilder() to construct.
  private PartitionOffset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionOffset() {
    metadata_ = "";
    sparseAcks_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartitionOffset();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartitionOffset(
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
          case 8: {

            partition_ = input.readInt32();
            break;
          }
          case 16: {

            begin_ = input.readInt64();
            break;
          }
          case 24: {

            end_ = input.readInt64();
            break;
          }
          case 32: {

            count_ = input.readInt64();
            break;
          }
          case 40: {

            offset_ = input.readInt64();
            break;
          }
          case 48: {

            lag_ = input.readInt64();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            metadata_ = s;
            break;
          }
          case 66: {
            String s = input.readStringRequireUtf8();

            sparseAcks_ = s;
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
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionOffset_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionOffset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mailgun.kafkapixy.PartitionOffset.class, mailgun.kafkapixy.PartitionOffset.Builder.class);
  }

  public static final int PARTITION_FIELD_NUMBER = 1;
  private int partition_;
  /**
   * <pre>
   * The Partition this structure describes
   * </pre>
   *
   * <code>int32 partition = 1;</code>
   * @return The partition.
   */
  @Override
  public int getPartition() {
    return partition_;
  }

  public static final int BEGIN_FIELD_NUMBER = 2;
  private long begin_;
  /**
   * <pre>
   * The beginning offset
   * </pre>
   *
   * <code>int64 begin = 2;</code>
   * @return The begin.
   */
  @Override
  public long getBegin() {
    return begin_;
  }

  public static final int END_FIELD_NUMBER = 3;
  private long end_;
  /**
   * <pre>
   * The ending offset
   * </pre>
   *
   * <code>int64 end = 3;</code>
   * @return The end.
   */
  @Override
  public long getEnd() {
    return end_;
  }

  public static final int COUNT_FIELD_NUMBER = 4;
  private long count_;
  /**
   * <pre>
   * The number of messages in the partition
   * </pre>
   *
   * <code>int64 count = 4;</code>
   * @return The count.
   */
  @Override
  public long getCount() {
    return count_;
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  private long offset_;
  /**
   * <pre>
   * Offset in the partition
   * </pre>
   *
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  @Override
  public long getOffset() {
    return offset_;
  }

  public static final int LAG_FIELD_NUMBER = 6;
  private long lag_;
  /**
   * <pre>
   * The number of un-consumed messages in the partition
   * </pre>
   *
   * <code>int64 lag = 6;</code>
   * @return The lag.
   */
  @Override
  public long getLag() {
    return lag_;
  }

  public static final int METADATA_FIELD_NUMBER = 7;
  private volatile Object metadata_;
  /**
   * <pre>
   * Metatdata associated with the partition
   * </pre>
   *
   * <code>string metadata = 7;</code>
   * @return The metadata.
   */
  @Override
  public String getMetadata() {
    Object ref = metadata_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      metadata_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Metatdata associated with the partition
   * </pre>
   *
   * <code>string metadata = 7;</code>
   * @return The bytes for metadata.
   */
  @Override
  public com.google.protobuf.ByteString
      getMetadataBytes() {
    Object ref = metadata_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      metadata_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPARSE_ACKS_FIELD_NUMBER = 8;
  private volatile Object sparseAcks_;
  /**
   * <pre>
   * human readable representation of sparsely committed ranges
   * </pre>
   *
   * <code>string sparse_acks = 8;</code>
   * @return The sparseAcks.
   */
  @Override
  public String getSparseAcks() {
    Object ref = sparseAcks_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      sparseAcks_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * human readable representation of sparsely committed ranges
   * </pre>
   *
   * <code>string sparse_acks = 8;</code>
   * @return The bytes for sparseAcks.
   */
  @Override
  public com.google.protobuf.ByteString
      getSparseAcksBytes() {
    Object ref = sparseAcks_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sparseAcks_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (partition_ != 0) {
      output.writeInt32(1, partition_);
    }
    if (begin_ != 0L) {
      output.writeInt64(2, begin_);
    }
    if (end_ != 0L) {
      output.writeInt64(3, end_);
    }
    if (count_ != 0L) {
      output.writeInt64(4, count_);
    }
    if (offset_ != 0L) {
      output.writeInt64(5, offset_);
    }
    if (lag_ != 0L) {
      output.writeInt64(6, lag_);
    }
    if (!getMetadataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, metadata_);
    }
    if (!getSparseAcksBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, sparseAcks_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, partition_);
    }
    if (begin_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, begin_);
    }
    if (end_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, end_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, count_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, offset_);
    }
    if (lag_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, lag_);
    }
    if (!getMetadataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, metadata_);
    }
    if (!getSparseAcksBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, sparseAcks_);
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
    if (!(obj instanceof mailgun.kafkapixy.PartitionOffset)) {
      return super.equals(obj);
    }
    mailgun.kafkapixy.PartitionOffset other = (mailgun.kafkapixy.PartitionOffset) obj;

    if (getPartition()
        != other.getPartition()) return false;
    if (getBegin()
        != other.getBegin()) return false;
    if (getEnd()
        != other.getEnd()) return false;
    if (getCount()
        != other.getCount()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getLag()
        != other.getLag()) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
    if (!getSparseAcks()
        .equals(other.getSparseAcks())) return false;
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
    hash = (37 * hash) + PARTITION_FIELD_NUMBER;
    hash = (53 * hash) + getPartition();
    hash = (37 * hash) + BEGIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBegin());
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEnd());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + LAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLag());
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (37 * hash) + SPARSE_ACKS_FIELD_NUMBER;
    hash = (53 * hash) + getSparseAcks().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionOffset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionOffset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionOffset parseFrom(
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
  public static Builder newBuilder(mailgun.kafkapixy.PartitionOffset prototype) {
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
   * Protobuf type {@code PartitionOffset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PartitionOffset)
      mailgun.kafkapixy.PartitionOffsetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionOffset_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionOffset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mailgun.kafkapixy.PartitionOffset.class, mailgun.kafkapixy.PartitionOffset.Builder.class);
    }

    // Construct using mailgun.kafkapixy.PartitionOffset.newBuilder()
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
      partition_ = 0;

      begin_ = 0L;

      end_ = 0L;

      count_ = 0L;

      offset_ = 0L;

      lag_ = 0L;

      metadata_ = "";

      sparseAcks_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionOffset_descriptor;
    }

    @Override
    public mailgun.kafkapixy.PartitionOffset getDefaultInstanceForType() {
      return mailgun.kafkapixy.PartitionOffset.getDefaultInstance();
    }

    @Override
    public mailgun.kafkapixy.PartitionOffset build() {
      mailgun.kafkapixy.PartitionOffset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public mailgun.kafkapixy.PartitionOffset buildPartial() {
      mailgun.kafkapixy.PartitionOffset result = new mailgun.kafkapixy.PartitionOffset(this);
      result.partition_ = partition_;
      result.begin_ = begin_;
      result.end_ = end_;
      result.count_ = count_;
      result.offset_ = offset_;
      result.lag_ = lag_;
      result.metadata_ = metadata_;
      result.sparseAcks_ = sparseAcks_;
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
      if (other instanceof mailgun.kafkapixy.PartitionOffset) {
        return mergeFrom((mailgun.kafkapixy.PartitionOffset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mailgun.kafkapixy.PartitionOffset other) {
      if (other == mailgun.kafkapixy.PartitionOffset.getDefaultInstance()) return this;
      if (other.getPartition() != 0) {
        setPartition(other.getPartition());
      }
      if (other.getBegin() != 0L) {
        setBegin(other.getBegin());
      }
      if (other.getEnd() != 0L) {
        setEnd(other.getEnd());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getLag() != 0L) {
        setLag(other.getLag());
      }
      if (!other.getMetadata().isEmpty()) {
        metadata_ = other.metadata_;
        onChanged();
      }
      if (!other.getSparseAcks().isEmpty()) {
        sparseAcks_ = other.sparseAcks_;
        onChanged();
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
      mailgun.kafkapixy.PartitionOffset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mailgun.kafkapixy.PartitionOffset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int partition_ ;
    /**
     * <pre>
     * The Partition this structure describes
     * </pre>
     *
     * <code>int32 partition = 1;</code>
     * @return The partition.
     */
    @Override
    public int getPartition() {
      return partition_;
    }
    /**
     * <pre>
     * The Partition this structure describes
     * </pre>
     *
     * <code>int32 partition = 1;</code>
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
     * The Partition this structure describes
     * </pre>
     *
     * <code>int32 partition = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartition() {

      partition_ = 0;
      onChanged();
      return this;
    }

    private long begin_ ;
    /**
     * <pre>
     * The beginning offset
     * </pre>
     *
     * <code>int64 begin = 2;</code>
     * @return The begin.
     */
    @Override
    public long getBegin() {
      return begin_;
    }
    /**
     * <pre>
     * The beginning offset
     * </pre>
     *
     * <code>int64 begin = 2;</code>
     * @param value The begin to set.
     * @return This builder for chaining.
     */
    public Builder setBegin(long value) {

      begin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The beginning offset
     * </pre>
     *
     * <code>int64 begin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBegin() {

      begin_ = 0L;
      onChanged();
      return this;
    }

    private long end_ ;
    /**
     * <pre>
     * The ending offset
     * </pre>
     *
     * <code>int64 end = 3;</code>
     * @return The end.
     */
    @Override
    public long getEnd() {
      return end_;
    }
    /**
     * <pre>
     * The ending offset
     * </pre>
     *
     * <code>int64 end = 3;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(long value) {

      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ending offset
     * </pre>
     *
     * <code>int64 end = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {

      end_ = 0L;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * The number of messages in the partition
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @return The count.
     */
    @Override
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * The number of messages in the partition
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of messages in the partition
     * </pre>
     *
     * <code>int64 count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {

      count_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <pre>
     * Offset in the partition
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
     * Offset in the partition
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
     * Offset in the partition
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

    private long lag_ ;
    /**
     * <pre>
     * The number of un-consumed messages in the partition
     * </pre>
     *
     * <code>int64 lag = 6;</code>
     * @return The lag.
     */
    @Override
    public long getLag() {
      return lag_;
    }
    /**
     * <pre>
     * The number of un-consumed messages in the partition
     * </pre>
     *
     * <code>int64 lag = 6;</code>
     * @param value The lag to set.
     * @return This builder for chaining.
     */
    public Builder setLag(long value) {

      lag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of un-consumed messages in the partition
     * </pre>
     *
     * <code>int64 lag = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLag() {

      lag_ = 0L;
      onChanged();
      return this;
    }

    private Object metadata_ = "";
    /**
     * <pre>
     * Metatdata associated with the partition
     * </pre>
     *
     * <code>string metadata = 7;</code>
     * @return The metadata.
     */
    public String getMetadata() {
      Object ref = metadata_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        metadata_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Metatdata associated with the partition
     * </pre>
     *
     * <code>string metadata = 7;</code>
     * @return The bytes for metadata.
     */
    public com.google.protobuf.ByteString
        getMetadataBytes() {
      Object ref = metadata_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        metadata_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Metatdata associated with the partition
     * </pre>
     *
     * <code>string metadata = 7;</code>
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      metadata_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metatdata associated with the partition
     * </pre>
     *
     * <code>string metadata = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {

      metadata_ = getDefaultInstance().getMetadata();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metatdata associated with the partition
     * </pre>
     *
     * <code>string metadata = 7;</code>
     * @param value The bytes for metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      metadata_ = value;
      onChanged();
      return this;
    }

    private Object sparseAcks_ = "";
    /**
     * <pre>
     * human readable representation of sparsely committed ranges
     * </pre>
     *
     * <code>string sparse_acks = 8;</code>
     * @return The sparseAcks.
     */
    public String getSparseAcks() {
      Object ref = sparseAcks_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sparseAcks_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * human readable representation of sparsely committed ranges
     * </pre>
     *
     * <code>string sparse_acks = 8;</code>
     * @return The bytes for sparseAcks.
     */
    public com.google.protobuf.ByteString
        getSparseAcksBytes() {
      Object ref = sparseAcks_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sparseAcks_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * human readable representation of sparsely committed ranges
     * </pre>
     *
     * <code>string sparse_acks = 8;</code>
     * @param value The sparseAcks to set.
     * @return This builder for chaining.
     */
    public Builder setSparseAcks(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      sparseAcks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * human readable representation of sparsely committed ranges
     * </pre>
     *
     * <code>string sparse_acks = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearSparseAcks() {

      sparseAcks_ = getDefaultInstance().getSparseAcks();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * human readable representation of sparsely committed ranges
     * </pre>
     *
     * <code>string sparse_acks = 8;</code>
     * @param value The bytes for sparseAcks to set.
     * @return This builder for chaining.
     */
    public Builder setSparseAcksBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      sparseAcks_ = value;
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


    // @@protoc_insertion_point(builder_scope:PartitionOffset)
  }

  // @@protoc_insertion_point(class_scope:PartitionOffset)
  private static final mailgun.kafkapixy.PartitionOffset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mailgun.kafkapixy.PartitionOffset();
  }

  public static mailgun.kafkapixy.PartitionOffset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionOffset>
      PARSER = new com.google.protobuf.AbstractParser<PartitionOffset>() {
    @Override
    public PartitionOffset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartitionOffset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionOffset> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PartitionOffset> getParserForType() {
    return PARSER;
  }

  @Override
  public mailgun.kafkapixy.PartitionOffset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

