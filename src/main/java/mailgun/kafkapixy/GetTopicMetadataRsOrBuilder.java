// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface GetTopicMetadataRsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetTopicMetadataRs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of this metadata
   * </pre>
   *
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * Config values
   * </pre>
   *
   * <code>map&lt;string, string&gt; config = 2;</code>
   */
  int getConfigCount();
  /**
   * <pre>
   * Config values
   * </pre>
   *
   * <code>map&lt;string, string&gt; config = 2;</code>
   */
  boolean containsConfig(
          String key);
  /**
   * Use {@link #getConfigMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getConfig();
  /**
   * <pre>
   * Config values
   * </pre>
   *
   * <code>map&lt;string, string&gt; config = 2;</code>
   */
  java.util.Map<String, String>
  getConfigMap();
  /**
   * <pre>
   * Config values
   * </pre>
   *
   * <code>map&lt;string, string&gt; config = 2;</code>
   */

  String getConfigOrDefault(
          String key,
          String defaultValue);
  /**
   * <pre>
   * Config values
   * </pre>
   *
   * <code>map&lt;string, string&gt; config = 2;</code>
   */

  String getConfigOrThrow(
          String key);

  /**
   * <pre>
   * Optional list of metadata for the partitions of this topic
   * </pre>
   *
   * <code>repeated .PartitionMetadata partitions = 3;</code>
   */
  java.util.List<mailgun.kafkapixy.PartitionMetadata>
      getPartitionsList();
  /**
   * <pre>
   * Optional list of metadata for the partitions of this topic
   * </pre>
   *
   * <code>repeated .PartitionMetadata partitions = 3;</code>
   */
  mailgun.kafkapixy.PartitionMetadata getPartitions(int index);
  /**
   * <pre>
   * Optional list of metadata for the partitions of this topic
   * </pre>
   *
   * <code>repeated .PartitionMetadata partitions = 3;</code>
   */
  int getPartitionsCount();
  /**
   * <pre>
   * Optional list of metadata for the partitions of this topic
   * </pre>
   *
   * <code>repeated .PartitionMetadata partitions = 3;</code>
   */
  java.util.List<? extends mailgun.kafkapixy.PartitionMetadataOrBuilder>
      getPartitionsOrBuilderList();
  /**
   * <pre>
   * Optional list of metadata for the partitions of this topic
   * </pre>
   *
   * <code>repeated .PartitionMetadata partitions = 3;</code>
   */
  mailgun.kafkapixy.PartitionMetadataOrBuilder getPartitionsOrBuilder(
          int index);
}