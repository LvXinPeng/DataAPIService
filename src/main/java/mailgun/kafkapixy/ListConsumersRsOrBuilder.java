// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface ListConsumersRsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ListConsumersRs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .ConsumerGroups&gt; groups = 1;</code>
   */
  int getGroupsCount();
  /**
   * <code>map&lt;string, .ConsumerGroups&gt; groups = 1;</code>
   */
  boolean containsGroups(
          String key);
  /**
   * Use {@link #getGroupsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, mailgun.kafkapixy.ConsumerGroups>
  getGroups();
  /**
   * <code>map&lt;string, .ConsumerGroups&gt; groups = 1;</code>
   */
  java.util.Map<String, mailgun.kafkapixy.ConsumerGroups>
  getGroupsMap();
  /**
   * <code>map&lt;string, .ConsumerGroups&gt; groups = 1;</code>
   */

  mailgun.kafkapixy.ConsumerGroups getGroupsOrDefault(
          String key,
          mailgun.kafkapixy.ConsumerGroups defaultValue);
  /**
   * <code>map&lt;string, .ConsumerGroups&gt; groups = 1;</code>
   */

  mailgun.kafkapixy.ConsumerGroups getGroupsOrThrow(
          String key);
}