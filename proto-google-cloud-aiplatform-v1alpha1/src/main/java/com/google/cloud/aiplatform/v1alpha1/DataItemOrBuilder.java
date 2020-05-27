/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1alpha1/data_item.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface DataItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.DataItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the DataItem.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the DataItem.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataItem was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataItem was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DataItem was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your DataItems.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one DataItem(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your DataItems.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one DataItem(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your DataItems.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one DataItem(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your DataItems.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one DataItem(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your DataItems.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one DataItem(System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The data that the DataItem represents (e.g. an image or a text snippet).
   * The schema of the payload is stored in the parent Dataset's
   * [data_item_schema][Dataset.data_item_schema].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Required. The data that the DataItem represents (e.g. an image or a text snippet).
   * The schema of the payload is stored in the parent Dataset's
   * [data_item_schema][Dataset.data_item_schema].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Value getPayload();
  /**
   *
   *
   * <pre>
   * Required. The data that the DataItem represents (e.g. an image or a text snippet).
   * The schema of the payload is stored in the parent Dataset's
   * [data_item_schema][Dataset.data_item_schema].
   * </pre>
   *
   * <code>.google.protobuf.Value payload = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ValueOrBuilder getPayloadOrBuilder();
}
