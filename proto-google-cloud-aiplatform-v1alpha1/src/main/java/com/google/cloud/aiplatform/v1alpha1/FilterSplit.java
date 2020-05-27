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
// source: google/cloud/aiplatform/v1alpha1/training_pipeline.proto

package com.google.cloud.aiplatform.v1alpha1;

/**
 *
 *
 * <pre>
 * Assigns input data to training, validation, and test sets based on the given
 * filters, data pieces not matched by any filter are ignored. Currently only
 * supported for Datasets containing DataItems.
 * If any of the filters in this message are to match nothing, then they can be
 * set as '-' (i.e. a minus sign).
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1alpha1.FilterSplit}
 */
public final class FilterSplit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1alpha1.FilterSplit)
    FilterSplitOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FilterSplit.newBuilder() to construct.
  private FilterSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FilterSplit() {
    trainingFilter_ = "";
    validationFilter_ = "";
    testFilter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FilterSplit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FilterSplit(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              trainingFilter_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              validationFilter_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              testFilter_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1alpha1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1alpha1_FilterSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1alpha1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1alpha1_FilterSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1alpha1.FilterSplit.class,
            com.google.cloud.aiplatform.v1alpha1.FilterSplit.Builder.class);
  }

  public static final int TRAINING_FILTER_FIELD_NUMBER = 1;
  private volatile java.lang.Object trainingFilter_;
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to train the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string training_filter = 1;</code>
   *
   * @return The trainingFilter.
   */
  public java.lang.String getTrainingFilter() {
    java.lang.Object ref = trainingFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trainingFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to train the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string training_filter = 1;</code>
   *
   * @return The bytes for trainingFilter.
   */
  public com.google.protobuf.ByteString getTrainingFilterBytes() {
    java.lang.Object ref = trainingFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      trainingFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATION_FILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object validationFilter_;
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to validate the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string validation_filter = 2;</code>
   *
   * @return The validationFilter.
   */
  public java.lang.String getValidationFilter() {
    java.lang.Object ref = validationFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validationFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to validate the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string validation_filter = 2;</code>
   *
   * @return The bytes for validationFilter.
   */
  public com.google.protobuf.ByteString getValidationFilterBytes() {
    java.lang.Object ref = validationFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      validationFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_FILTER_FIELD_NUMBER = 3;
  private volatile java.lang.Object testFilter_;
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to test the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string test_filter = 3;</code>
   *
   * @return The testFilter.
   */
  public java.lang.String getTestFilter() {
    java.lang.Object ref = testFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter on DataItems of the Dataset. DataItems that match
   * this filter are used to test the Model. A filter with same syntax
   * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
   * single DataItem is matched by more than one of the FilterSplit filters,
   * then it will be assigned to the first set that applies to it in the
   * training, validation, test order.
   * </pre>
   *
   * <code>string test_filter = 3;</code>
   *
   * @return The bytes for testFilter.
   */
  public com.google.protobuf.ByteString getTestFilterBytes() {
    java.lang.Object ref = testFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      testFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getTrainingFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trainingFilter_);
    }
    if (!getValidationFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, validationFilter_);
    }
    if (!getTestFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, testFilter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrainingFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trainingFilter_);
    }
    if (!getValidationFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, validationFilter_);
    }
    if (!getTestFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, testFilter_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1alpha1.FilterSplit)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1alpha1.FilterSplit other =
        (com.google.cloud.aiplatform.v1alpha1.FilterSplit) obj;

    if (!getTrainingFilter().equals(other.getTrainingFilter())) return false;
    if (!getValidationFilter().equals(other.getValidationFilter())) return false;
    if (!getTestFilter().equals(other.getTestFilter())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRAINING_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getTrainingFilter().hashCode();
    hash = (37 * hash) + VALIDATION_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getValidationFilter().hashCode();
    hash = (37 * hash) + TEST_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getTestFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.aiplatform.v1alpha1.FilterSplit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Assigns input data to training, validation, and test sets based on the given
   * filters, data pieces not matched by any filter are ignored. Currently only
   * supported for Datasets containing DataItems.
   * If any of the filters in this message are to match nothing, then they can be
   * set as '-' (i.e. a minus sign).
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1alpha1.FilterSplit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1alpha1.FilterSplit)
      com.google.cloud.aiplatform.v1alpha1.FilterSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1alpha1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1alpha1_FilterSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1alpha1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1alpha1_FilterSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1alpha1.FilterSplit.class,
              com.google.cloud.aiplatform.v1alpha1.FilterSplit.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1alpha1.FilterSplit.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      trainingFilter_ = "";

      validationFilter_ = "";

      testFilter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1alpha1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1alpha1_FilterSplit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.FilterSplit getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1alpha1.FilterSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.FilterSplit build() {
      com.google.cloud.aiplatform.v1alpha1.FilterSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.FilterSplit buildPartial() {
      com.google.cloud.aiplatform.v1alpha1.FilterSplit result =
          new com.google.cloud.aiplatform.v1alpha1.FilterSplit(this);
      result.trainingFilter_ = trainingFilter_;
      result.validationFilter_ = validationFilter_;
      result.testFilter_ = testFilter_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1alpha1.FilterSplit) {
        return mergeFrom((com.google.cloud.aiplatform.v1alpha1.FilterSplit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1alpha1.FilterSplit other) {
      if (other == com.google.cloud.aiplatform.v1alpha1.FilterSplit.getDefaultInstance())
        return this;
      if (!other.getTrainingFilter().isEmpty()) {
        trainingFilter_ = other.trainingFilter_;
        onChanged();
      }
      if (!other.getValidationFilter().isEmpty()) {
        validationFilter_ = other.validationFilter_;
        onChanged();
      }
      if (!other.getTestFilter().isEmpty()) {
        testFilter_ = other.testFilter_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.aiplatform.v1alpha1.FilterSplit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1alpha1.FilterSplit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object trainingFilter_ = "";
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to train the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string training_filter = 1;</code>
     *
     * @return The trainingFilter.
     */
    public java.lang.String getTrainingFilter() {
      java.lang.Object ref = trainingFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trainingFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to train the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string training_filter = 1;</code>
     *
     * @return The bytes for trainingFilter.
     */
    public com.google.protobuf.ByteString getTrainingFilterBytes() {
      java.lang.Object ref = trainingFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        trainingFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to train the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string training_filter = 1;</code>
     *
     * @param value The trainingFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      trainingFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to train the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string training_filter = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrainingFilter() {

      trainingFilter_ = getDefaultInstance().getTrainingFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to train the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string training_filter = 1;</code>
     *
     * @param value The bytes for trainingFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      trainingFilter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object validationFilter_ = "";
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to validate the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string validation_filter = 2;</code>
     *
     * @return The validationFilter.
     */
    public java.lang.String getValidationFilter() {
      java.lang.Object ref = validationFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validationFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to validate the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string validation_filter = 2;</code>
     *
     * @return The bytes for validationFilter.
     */
    public com.google.protobuf.ByteString getValidationFilterBytes() {
      java.lang.Object ref = validationFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        validationFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to validate the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string validation_filter = 2;</code>
     *
     * @param value The validationFilter to set.
     * @return This builder for chaining.
     */
    public Builder setValidationFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      validationFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to validate the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string validation_filter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidationFilter() {

      validationFilter_ = getDefaultInstance().getValidationFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to validate the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string validation_filter = 2;</code>
     *
     * @param value The bytes for validationFilter to set.
     * @return This builder for chaining.
     */
    public Builder setValidationFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      validationFilter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object testFilter_ = "";
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to test the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string test_filter = 3;</code>
     *
     * @return The testFilter.
     */
    public java.lang.String getTestFilter() {
      java.lang.Object ref = testFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to test the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string test_filter = 3;</code>
     *
     * @return The bytes for testFilter.
     */
    public com.google.protobuf.ByteString getTestFilterBytes() {
      java.lang.Object ref = testFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        testFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to test the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string test_filter = 3;</code>
     *
     * @param value The testFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTestFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      testFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to test the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string test_filter = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTestFilter() {

      testFilter_ = getDefaultInstance().getTestFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter on DataItems of the Dataset. DataItems that match
     * this filter are used to test the Model. A filter with same syntax
     * as the one used in [DatasetService.ListDataItems][google.cloud.aiplatform.v1alpha1.DatasetService.ListDataItems] may be used. If a
     * single DataItem is matched by more than one of the FilterSplit filters,
     * then it will be assigned to the first set that applies to it in the
     * training, validation, test order.
     * </pre>
     *
     * <code>string test_filter = 3;</code>
     *
     * @param value The bytes for testFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTestFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      testFilter_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1alpha1.FilterSplit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1alpha1.FilterSplit)
  private static final com.google.cloud.aiplatform.v1alpha1.FilterSplit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1alpha1.FilterSplit();
  }

  public static com.google.cloud.aiplatform.v1alpha1.FilterSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterSplit> PARSER =
      new com.google.protobuf.AbstractParser<FilterSplit>() {
        @java.lang.Override
        public FilterSplit parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FilterSplit(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FilterSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1alpha1.FilterSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
