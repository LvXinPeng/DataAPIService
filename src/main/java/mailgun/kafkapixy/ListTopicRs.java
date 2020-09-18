// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

/**
 * Protobuf type {@code ListTopicRs}
 */
public final class ListTopicRs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListTopicRs)
        ListTopicRsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTopicRs.newBuilder() to construct.
  private ListTopicRs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTopicRs() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTopicRs();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTopicRs(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              topics_ = com.google.protobuf.MapField.newMapField(
                  TopicsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<String, GetTopicMetadataRs>
            topics__ = input.readMessage(
                TopicsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            topics_.getMutableMap().put(
                topics__.getKey(), topics__.getValue());
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
    return KafkaPixyProto.internal_static_ListTopicRs_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetTopics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return KafkaPixyProto.internal_static_ListTopicRs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListTopicRs.class, Builder.class);
  }

  public static final int TOPICS_FIELD_NUMBER = 1;
  private static final class TopicsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, GetTopicMetadataRs> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, GetTopicMetadataRs>newDefaultInstance(
                KafkaPixyProto.internal_static_ListTopicRs_TopicsEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                GetTopicMetadataRs.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      String, GetTopicMetadataRs> topics_;
  private com.google.protobuf.MapField<String, GetTopicMetadataRs>
  internalGetTopics() {
    if (topics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TopicsDefaultEntryHolder.defaultEntry);
    }
    return topics_;
  }

  public int getTopicsCount() {
    return internalGetTopics().getMap().size();
  }
  /**
   * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
   */

  @Override
  public boolean containsTopics(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetTopics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTopicsMap()} instead.
   */
  @Override
  @Deprecated
  public java.util.Map<String, GetTopicMetadataRs> getTopics() {
    return getTopicsMap();
  }
  /**
   * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
   */
  @Override

  public java.util.Map<String, GetTopicMetadataRs> getTopicsMap() {
    return internalGetTopics().getMap();
  }
  /**
   * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
   */
  @Override

  public GetTopicMetadataRs getTopicsOrDefault(
      String key,
      GetTopicMetadataRs defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, GetTopicMetadataRs> map =
        internalGetTopics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
   */
  @Override

  public GetTopicMetadataRs getTopicsOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, GetTopicMetadataRs> map =
        internalGetTopics().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetTopics(),
        TopicsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<String, GetTopicMetadataRs> entry
         : internalGetTopics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, GetTopicMetadataRs>
      topics__ = TopicsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, topics__);
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
    if (!(obj instanceof ListTopicRs)) {
      return super.equals(obj);
    }
    ListTopicRs other = (ListTopicRs) obj;

    if (!internalGetTopics().equals(
        other.internalGetTopics())) return false;
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
    if (!internalGetTopics().getMap().isEmpty()) {
      hash = (37 * hash) + TOPICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTopics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListTopicRs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTopicRs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTopicRs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTopicRs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTopicRs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTopicRs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTopicRs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListTopicRs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListTopicRs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ListTopicRs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListTopicRs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListTopicRs parseFrom(
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
  public static Builder newBuilder(ListTopicRs prototype) {
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
   * Protobuf type {@code ListTopicRs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListTopicRs)
      ListTopicRsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return KafkaPixyProto.internal_static_ListTopicRs_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetTopics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableTopics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return KafkaPixyProto.internal_static_ListTopicRs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListTopicRs.class, Builder.class);
    }

    // Construct using mailgun.kafkapixy.ListTopicRs.newBuilder()
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
      internalGetMutableTopics().clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return KafkaPixyProto.internal_static_ListTopicRs_descriptor;
    }

    @Override
    public ListTopicRs getDefaultInstanceForType() {
      return ListTopicRs.getDefaultInstance();
    }

    @Override
    public ListTopicRs build() {
      ListTopicRs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ListTopicRs buildPartial() {
      ListTopicRs result = new ListTopicRs(this);
      int from_bitField0_ = bitField0_;
      result.topics_ = internalGetTopics();
      result.topics_.makeImmutable();
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
      if (other instanceof ListTopicRs) {
        return mergeFrom((ListTopicRs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListTopicRs other) {
      if (other == ListTopicRs.getDefaultInstance()) return this;
      internalGetMutableTopics().mergeFrom(
          other.internalGetTopics());
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
      ListTopicRs parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ListTopicRs) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        String, GetTopicMetadataRs> topics_;
    private com.google.protobuf.MapField<String, GetTopicMetadataRs>
    internalGetTopics() {
      if (topics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TopicsDefaultEntryHolder.defaultEntry);
      }
      return topics_;
    }
    private com.google.protobuf.MapField<String, GetTopicMetadataRs>
    internalGetMutableTopics() {
      onChanged();;
      if (topics_ == null) {
        topics_ = com.google.protobuf.MapField.newMapField(
            TopicsDefaultEntryHolder.defaultEntry);
      }
      if (!topics_.isMutable()) {
        topics_ = topics_.copy();
      }
      return topics_;
    }

    public int getTopicsCount() {
      return internalGetTopics().getMap().size();
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */

    @Override
    public boolean containsTopics(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetTopics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTopicsMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, GetTopicMetadataRs> getTopics() {
      return getTopicsMap();
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */
    @Override

    public java.util.Map<String, GetTopicMetadataRs> getTopicsMap() {
      return internalGetTopics().getMap();
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */
    @Override

    public GetTopicMetadataRs getTopicsOrDefault(
        String key,
        GetTopicMetadataRs defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, GetTopicMetadataRs> map =
          internalGetTopics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */
    @Override

    public GetTopicMetadataRs getTopicsOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, GetTopicMetadataRs> map =
          internalGetTopics().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearTopics() {
      internalGetMutableTopics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */

    public Builder removeTopics(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      internalGetMutableTopics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, GetTopicMetadataRs>
    getMutableTopics() {
      return internalGetMutableTopics().getMutableMap();
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */
    public Builder putTopics(
        String key,
        GetTopicMetadataRs value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      internalGetMutableTopics().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .GetTopicMetadataRs&gt; topics = 1;</code>
     */

    public Builder putAllTopics(
        java.util.Map<String, GetTopicMetadataRs> values) {
      internalGetMutableTopics().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:ListTopicRs)
  }

  // @@protoc_insertion_point(class_scope:ListTopicRs)
  private static final ListTopicRs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListTopicRs();
  }

  public static ListTopicRs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTopicRs>
      PARSER = new com.google.protobuf.AbstractParser<ListTopicRs>() {
    @Override
    public ListTopicRs parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTopicRs(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTopicRs> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListTopicRs> getParserForType() {
    return PARSER;
  }

  @Override
  public ListTopicRs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

