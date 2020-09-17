// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * <pre>
 * Partition metadata as retrieved from kafka
 * </pre>
 *
 * Protobuf type {@code PartitionMetadata}
 */
public final class PartitionMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PartitionMetadata)
        PartitionMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionMetadata.newBuilder() to construct.
  private PartitionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionMetadata() {
    replicas_ = emptyIntList();
    isr_ = emptyIntList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PartitionMetadata();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartitionMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            leader_ = input.readInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              replicas_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            replicas_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              replicas_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              replicas_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              isr_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            isr_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              isr_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              isr_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        replicas_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        isr_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionMetadata_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mailgun.kafkapixy.PartitionMetadata.class, mailgun.kafkapixy.PartitionMetadata.Builder.class);
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

  public static final int LEADER_FIELD_NUMBER = 2;
  private int leader_;
  /**
   * <pre>
   * The node id for the kafka broker currently acting as leader for this partition.
   * If no leader exists because we are in the middle of a leader election this id will be -1.
   * </pre>
   *
   * <code>int32 leader = 2;</code>
   * @return The leader.
   */
  @Override
  public int getLeader() {
    return leader_;
  }

  public static final int REPLICAS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList replicas_;
  /**
   * <pre>
   * The set of alive nodes that currently acts as slaves for the leader for this partition.
   * </pre>
   *
   * <code>repeated int32 replicas = 3;</code>
   * @return A list containing the replicas.
   */
  @Override
  public java.util.List<Integer>
      getReplicasList() {
    return replicas_;
  }
  /**
   * <pre>
   * The set of alive nodes that currently acts as slaves for the leader for this partition.
   * </pre>
   *
   * <code>repeated int32 replicas = 3;</code>
   * @return The count of replicas.
   */
  public int getReplicasCount() {
    return replicas_.size();
  }
  /**
   * <pre>
   * The set of alive nodes that currently acts as slaves for the leader for this partition.
   * </pre>
   *
   * <code>repeated int32 replicas = 3;</code>
   * @param index The index of the element to return.
   * @return The replicas at the given index.
   */
  public int getReplicas(int index) {
    return replicas_.getInt(index);
  }
  private int replicasMemoizedSerializedSize = -1;

  public static final int ISR_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList isr_;
  /**
   * <pre>
   * The set subset of the replicas that are "caught up" to the leader
   * </pre>
   *
   * <code>repeated int32 isr = 4;</code>
   * @return A list containing the isr.
   */
  @Override
  public java.util.List<Integer>
      getIsrList() {
    return isr_;
  }
  /**
   * <pre>
   * The set subset of the replicas that are "caught up" to the leader
   * </pre>
   *
   * <code>repeated int32 isr = 4;</code>
   * @return The count of isr.
   */
  public int getIsrCount() {
    return isr_.size();
  }
  /**
   * <pre>
   * The set subset of the replicas that are "caught up" to the leader
   * </pre>
   *
   * <code>repeated int32 isr = 4;</code>
   * @param index The index of the element to return.
   * @return The isr at the given index.
   */
  public int getIsr(int index) {
    return isr_.getInt(index);
  }
  private int isrMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (partition_ != 0) {
      output.writeInt32(1, partition_);
    }
    if (leader_ != 0) {
      output.writeInt32(2, leader_);
    }
    if (getReplicasList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(replicasMemoizedSerializedSize);
    }
    for (int i = 0; i < replicas_.size(); i++) {
      output.writeInt32NoTag(replicas_.getInt(i));
    }
    if (getIsrList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(isrMemoizedSerializedSize);
    }
    for (int i = 0; i < isr_.size(); i++) {
      output.writeInt32NoTag(isr_.getInt(i));
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
    if (leader_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, leader_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < replicas_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(replicas_.getInt(i));
      }
      size += dataSize;
      if (!getReplicasList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      replicasMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < isr_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(isr_.getInt(i));
      }
      size += dataSize;
      if (!getIsrList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      isrMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof mailgun.kafkapixy.PartitionMetadata)) {
      return super.equals(obj);
    }
    mailgun.kafkapixy.PartitionMetadata other = (mailgun.kafkapixy.PartitionMetadata) obj;

    if (getPartition()
        != other.getPartition()) return false;
    if (getLeader()
        != other.getLeader()) return false;
    if (!getReplicasList()
        .equals(other.getReplicasList())) return false;
    if (!getIsrList()
        .equals(other.getIsrList())) return false;
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
    hash = (37 * hash) + LEADER_FIELD_NUMBER;
    hash = (53 * hash) + getLeader();
    if (getReplicasCount() > 0) {
      hash = (37 * hash) + REPLICAS_FIELD_NUMBER;
      hash = (53 * hash) + getReplicasList().hashCode();
    }
    if (getIsrCount() > 0) {
      hash = (37 * hash) + ISR_FIELD_NUMBER;
      hash = (53 * hash) + getIsrList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.PartitionMetadata parseFrom(
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
  public static Builder newBuilder(mailgun.kafkapixy.PartitionMetadata prototype) {
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
   * <pre>
   * Partition metadata as retrieved from kafka
   * </pre>
   *
   * Protobuf type {@code PartitionMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PartitionMetadata)
      mailgun.kafkapixy.PartitionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionMetadata_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mailgun.kafkapixy.PartitionMetadata.class, mailgun.kafkapixy.PartitionMetadata.Builder.class);
    }

    // Construct using mailgun.kafkapixy.PartitionMetadata.newBuilder()
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

      leader_ = 0;

      replicas_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      isr_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_PartitionMetadata_descriptor;
    }

    @Override
    public mailgun.kafkapixy.PartitionMetadata getDefaultInstanceForType() {
      return mailgun.kafkapixy.PartitionMetadata.getDefaultInstance();
    }

    @Override
    public mailgun.kafkapixy.PartitionMetadata build() {
      mailgun.kafkapixy.PartitionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public mailgun.kafkapixy.PartitionMetadata buildPartial() {
      mailgun.kafkapixy.PartitionMetadata result = new mailgun.kafkapixy.PartitionMetadata(this);
      int from_bitField0_ = bitField0_;
      result.partition_ = partition_;
      result.leader_ = leader_;
      if (((bitField0_ & 0x00000001) != 0)) {
        replicas_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.replicas_ = replicas_;
      if (((bitField0_ & 0x00000002) != 0)) {
        isr_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.isr_ = isr_;
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
      if (other instanceof mailgun.kafkapixy.PartitionMetadata) {
        return mergeFrom((mailgun.kafkapixy.PartitionMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mailgun.kafkapixy.PartitionMetadata other) {
      if (other == mailgun.kafkapixy.PartitionMetadata.getDefaultInstance()) return this;
      if (other.getPartition() != 0) {
        setPartition(other.getPartition());
      }
      if (other.getLeader() != 0) {
        setLeader(other.getLeader());
      }
      if (!other.replicas_.isEmpty()) {
        if (replicas_.isEmpty()) {
          replicas_ = other.replicas_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureReplicasIsMutable();
          replicas_.addAll(other.replicas_);
        }
        onChanged();
      }
      if (!other.isr_.isEmpty()) {
        if (isr_.isEmpty()) {
          isr_ = other.isr_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureIsrIsMutable();
          isr_.addAll(other.isr_);
        }
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
      mailgun.kafkapixy.PartitionMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mailgun.kafkapixy.PartitionMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private int leader_ ;
    /**
     * <pre>
     * The node id for the kafka broker currently acting as leader for this partition.
     * If no leader exists because we are in the middle of a leader election this id will be -1.
     * </pre>
     *
     * <code>int32 leader = 2;</code>
     * @return The leader.
     */
    @Override
    public int getLeader() {
      return leader_;
    }
    /**
     * <pre>
     * The node id for the kafka broker currently acting as leader for this partition.
     * If no leader exists because we are in the middle of a leader election this id will be -1.
     * </pre>
     *
     * <code>int32 leader = 2;</code>
     * @param value The leader to set.
     * @return This builder for chaining.
     */
    public Builder setLeader(int value) {

      leader_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node id for the kafka broker currently acting as leader for this partition.
     * If no leader exists because we are in the middle of a leader election this id will be -1.
     * </pre>
     *
     * <code>int32 leader = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeader() {

      leader_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList replicas_ = emptyIntList();
    private void ensureReplicasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        replicas_ = mutableCopy(replicas_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @return A list containing the replicas.
     */
    public java.util.List<Integer>
        getReplicasList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(replicas_) : replicas_;
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @return The count of replicas.
     */
    public int getReplicasCount() {
      return replicas_.size();
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @param index The index of the element to return.
     * @return The replicas at the given index.
     */
    public int getReplicas(int index) {
      return replicas_.getInt(index);
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @param index The index to set the value at.
     * @param value The replicas to set.
     * @return This builder for chaining.
     */
    public Builder setReplicas(
        int index, int value) {
      ensureReplicasIsMutable();
      replicas_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @param value The replicas to add.
     * @return This builder for chaining.
     */
    public Builder addReplicas(int value) {
      ensureReplicasIsMutable();
      replicas_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @param values The replicas to add.
     * @return This builder for chaining.
     */
    public Builder addAllReplicas(
        Iterable<? extends Integer> values) {
      ensureReplicasIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, replicas_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of alive nodes that currently acts as slaves for the leader for this partition.
     * </pre>
     *
     * <code>repeated int32 replicas = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplicas() {
      replicas_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList isr_ = emptyIntList();
    private void ensureIsrIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        isr_ = mutableCopy(isr_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @return A list containing the isr.
     */
    public java.util.List<Integer>
        getIsrList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(isr_) : isr_;
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @return The count of isr.
     */
    public int getIsrCount() {
      return isr_.size();
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @param index The index of the element to return.
     * @return The isr at the given index.
     */
    public int getIsr(int index) {
      return isr_.getInt(index);
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @param index The index to set the value at.
     * @param value The isr to set.
     * @return This builder for chaining.
     */
    public Builder setIsr(
        int index, int value) {
      ensureIsrIsMutable();
      isr_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @param value The isr to add.
     * @return This builder for chaining.
     */
    public Builder addIsr(int value) {
      ensureIsrIsMutable();
      isr_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @param values The isr to add.
     * @return This builder for chaining.
     */
    public Builder addAllIsr(
        Iterable<? extends Integer> values) {
      ensureIsrIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, isr_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set subset of the replicas that are "caught up" to the leader
     * </pre>
     *
     * <code>repeated int32 isr = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsr() {
      isr_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:PartitionMetadata)
  }

  // @@protoc_insertion_point(class_scope:PartitionMetadata)
  private static final mailgun.kafkapixy.PartitionMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mailgun.kafkapixy.PartitionMetadata();
  }

  public static mailgun.kafkapixy.PartitionMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionMetadata>
      PARSER = new com.google.protobuf.AbstractParser<PartitionMetadata>() {
    @Override
    public PartitionMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartitionMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionMetadata> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PartitionMetadata> getParserForType() {
    return PARSER;
  }

  @Override
  public mailgun.kafkapixy.PartitionMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
