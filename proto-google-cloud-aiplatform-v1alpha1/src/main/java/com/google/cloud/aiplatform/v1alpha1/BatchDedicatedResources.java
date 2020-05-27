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
// source: google/cloud/aiplatform/v1alpha1/machine_resources.proto

package com.google.cloud.aiplatform.v1alpha1;

/**
 *
 *
 * <pre>
 * A description of resources that are used for performing batch operations, are
 * dedicated to a Model, and need manual configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1alpha1.BatchDedicatedResources}
 */
public final class BatchDedicatedResources extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1alpha1.BatchDedicatedResources)
    BatchDedicatedResourcesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDedicatedResources.newBuilder() to construct.
  private BatchDedicatedResources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDedicatedResources() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchDedicatedResources();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchDedicatedResources(
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
              com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder subBuilder = null;
              if (machineSpec_ != null) {
                subBuilder = machineSpec_.toBuilder();
              }
              machineSpec_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1alpha1.MachineSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(machineSpec_);
                machineSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              startingReplicaCount_ = input.readInt32();
              break;
            }
          case 24:
            {
              maxReplicaCount_ = input.readInt32();
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
    return com.google.cloud.aiplatform.v1alpha1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1alpha1_BatchDedicatedResources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1alpha1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1alpha1_BatchDedicatedResources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.class,
            com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.Builder.class);
  }

  public static final int MACHINE_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1alpha1.MachineSpec machineSpec_;
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  public boolean hasMachineSpec() {
    return machineSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  public com.google.cloud.aiplatform.v1alpha1.MachineSpec getMachineSpec() {
    return machineSpec_ == null
        ? com.google.cloud.aiplatform.v1alpha1.MachineSpec.getDefaultInstance()
        : machineSpec_;
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  public com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder getMachineSpecOrBuilder() {
    return getMachineSpec();
  }

  public static final int STARTING_REPLICA_COUNT_FIELD_NUMBER = 2;
  private int startingReplicaCount_;
  /**
   *
   *
   * <pre>
   * Immutable. The number of machine replicas used at the start of the batch operation.
   * If not set, AI Platform decides starting number, not greater than
   * [max_replica_count][google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.max_replica_count]
   * </pre>
   *
   * <code>int32 starting_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The startingReplicaCount.
   */
  public int getStartingReplicaCount() {
    return startingReplicaCount_;
  }

  public static final int MAX_REPLICA_COUNT_FIELD_NUMBER = 3;
  private int maxReplicaCount_;
  /**
   *
   *
   * <pre>
   * Immutable. The maximum number of machine replicas the batch operation may be scaled
   * to. The default value is 10.
   * </pre>
   *
   * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The maxReplicaCount.
   */
  public int getMaxReplicaCount() {
    return maxReplicaCount_;
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
    if (machineSpec_ != null) {
      output.writeMessage(1, getMachineSpec());
    }
    if (startingReplicaCount_ != 0) {
      output.writeInt32(2, startingReplicaCount_);
    }
    if (maxReplicaCount_ != 0) {
      output.writeInt32(3, maxReplicaCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (machineSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMachineSpec());
    }
    if (startingReplicaCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, startingReplicaCount_);
    }
    if (maxReplicaCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxReplicaCount_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources other =
        (com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources) obj;

    if (hasMachineSpec() != other.hasMachineSpec()) return false;
    if (hasMachineSpec()) {
      if (!getMachineSpec().equals(other.getMachineSpec())) return false;
    }
    if (getStartingReplicaCount() != other.getStartingReplicaCount()) return false;
    if (getMaxReplicaCount() != other.getMaxReplicaCount()) return false;
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
    if (hasMachineSpec()) {
      hash = (37 * hash) + MACHINE_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getMachineSpec().hashCode();
    }
    hash = (37 * hash) + STARTING_REPLICA_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getStartingReplicaCount();
    hash = (37 * hash) + MAX_REPLICA_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxReplicaCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources prototype) {
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
   * A description of resources that are used for performing batch operations, are
   * dedicated to a Model, and need manual configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1alpha1.BatchDedicatedResources}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1alpha1.BatchDedicatedResources)
      com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1alpha1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1alpha1_BatchDedicatedResources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1alpha1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1alpha1_BatchDedicatedResources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.class,
              com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.newBuilder()
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
      if (machineSpecBuilder_ == null) {
        machineSpec_ = null;
      } else {
        machineSpec_ = null;
        machineSpecBuilder_ = null;
      }
      startingReplicaCount_ = 0;

      maxReplicaCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1alpha1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1alpha1_BatchDedicatedResources_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources build() {
      com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources buildPartial() {
      com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources result =
          new com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources(this);
      if (machineSpecBuilder_ == null) {
        result.machineSpec_ = machineSpec_;
      } else {
        result.machineSpec_ = machineSpecBuilder_.build();
      }
      result.startingReplicaCount_ = startingReplicaCount_;
      result.maxReplicaCount_ = maxReplicaCount_;
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
      if (other instanceof com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources) {
        return mergeFrom((com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources other) {
      if (other
          == com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.getDefaultInstance())
        return this;
      if (other.hasMachineSpec()) {
        mergeMachineSpec(other.getMachineSpec());
      }
      if (other.getStartingReplicaCount() != 0) {
        setStartingReplicaCount(other.getStartingReplicaCount());
      }
      if (other.getMaxReplicaCount() != 0) {
        setMaxReplicaCount(other.getMaxReplicaCount());
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
      com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1alpha1.MachineSpec machineSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1alpha1.MachineSpec,
            com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder,
            com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder>
        machineSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return Whether the machineSpec field is set.
     */
    public boolean hasMachineSpec() {
      return machineSpecBuilder_ != null || machineSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The machineSpec.
     */
    public com.google.cloud.aiplatform.v1alpha1.MachineSpec getMachineSpec() {
      if (machineSpecBuilder_ == null) {
        return machineSpec_ == null
            ? com.google.cloud.aiplatform.v1alpha1.MachineSpec.getDefaultInstance()
            : machineSpec_;
      } else {
        return machineSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder setMachineSpec(com.google.cloud.aiplatform.v1alpha1.MachineSpec value) {
      if (machineSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        machineSpec_ = value;
        onChanged();
      } else {
        machineSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder setMachineSpec(
        com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder builderForValue) {
      if (machineSpecBuilder_ == null) {
        machineSpec_ = builderForValue.build();
        onChanged();
      } else {
        machineSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder mergeMachineSpec(com.google.cloud.aiplatform.v1alpha1.MachineSpec value) {
      if (machineSpecBuilder_ == null) {
        if (machineSpec_ != null) {
          machineSpec_ =
              com.google.cloud.aiplatform.v1alpha1.MachineSpec.newBuilder(machineSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          machineSpec_ = value;
        }
        onChanged();
      } else {
        machineSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public Builder clearMachineSpec() {
      if (machineSpecBuilder_ == null) {
        machineSpec_ = null;
        onChanged();
      } else {
        machineSpec_ = null;
        machineSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder getMachineSpecBuilder() {

      onChanged();
      return getMachineSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    public com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder getMachineSpecOrBuilder() {
      if (machineSpecBuilder_ != null) {
        return machineSpecBuilder_.getMessageOrBuilder();
      } else {
        return machineSpec_ == null
            ? com.google.cloud.aiplatform.v1alpha1.MachineSpec.getDefaultInstance()
            : machineSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The specification of a single machine.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1alpha1.MachineSpec,
            com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder,
            com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder>
        getMachineSpecFieldBuilder() {
      if (machineSpecBuilder_ == null) {
        machineSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1alpha1.MachineSpec,
                com.google.cloud.aiplatform.v1alpha1.MachineSpec.Builder,
                com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder>(
                getMachineSpec(), getParentForChildren(), isClean());
        machineSpec_ = null;
      }
      return machineSpecBuilder_;
    }

    private int startingReplicaCount_;
    /**
     *
     *
     * <pre>
     * Immutable. The number of machine replicas used at the start of the batch operation.
     * If not set, AI Platform decides starting number, not greater than
     * [max_replica_count][google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.max_replica_count]
     * </pre>
     *
     * <code>int32 starting_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The startingReplicaCount.
     */
    public int getStartingReplicaCount() {
      return startingReplicaCount_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The number of machine replicas used at the start of the batch operation.
     * If not set, AI Platform decides starting number, not greater than
     * [max_replica_count][google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.max_replica_count]
     * </pre>
     *
     * <code>int32 starting_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The startingReplicaCount to set.
     * @return This builder for chaining.
     */
    public Builder setStartingReplicaCount(int value) {

      startingReplicaCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The number of machine replicas used at the start of the batch operation.
     * If not set, AI Platform decides starting number, not greater than
     * [max_replica_count][google.cloud.aiplatform.v1alpha1.BatchDedicatedResources.max_replica_count]
     * </pre>
     *
     * <code>int32 starting_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartingReplicaCount() {

      startingReplicaCount_ = 0;
      onChanged();
      return this;
    }

    private int maxReplicaCount_;
    /**
     *
     *
     * <pre>
     * Immutable. The maximum number of machine replicas the batch operation may be scaled
     * to. The default value is 10.
     * </pre>
     *
     * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The maxReplicaCount.
     */
    public int getMaxReplicaCount() {
      return maxReplicaCount_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The maximum number of machine replicas the batch operation may be scaled
     * to. The default value is 10.
     * </pre>
     *
     * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The maxReplicaCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxReplicaCount(int value) {

      maxReplicaCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The maximum number of machine replicas the batch operation may be scaled
     * to. The default value is 10.
     * </pre>
     *
     * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxReplicaCount() {

      maxReplicaCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1alpha1.BatchDedicatedResources)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1alpha1.BatchDedicatedResources)
  private static final com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources();
  }

  public static com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDedicatedResources> PARSER =
      new com.google.protobuf.AbstractParser<BatchDedicatedResources>() {
        @java.lang.Override
        public BatchDedicatedResources parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchDedicatedResources(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchDedicatedResources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDedicatedResources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1alpha1.BatchDedicatedResources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
