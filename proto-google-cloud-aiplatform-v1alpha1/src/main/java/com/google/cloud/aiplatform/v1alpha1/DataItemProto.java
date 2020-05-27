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

public final class DataItemProto {
  private DataItemProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1alpha1_DataItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1alpha1_DataItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1alpha1_DataItem_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1alpha1_DataItem_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1alpha1/data_"
          + "item.proto\022 google.cloud.aiplatform.v1al"
          + "pha1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032\034google/protobu"
          + "f/struct.proto\032\037google/protobuf/timestam"
          + "p.proto\032\034google/api/annotations.proto\"\370\002"
          + "\n\010DataItem\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_"
          + "time\030\002 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022K\n\006labels\030\003 \003(\01326.google.cloud.aipla"
          + "tform.v1alpha1.DataItem.LabelsEntryB\003\340A\001"
          + "\022,\n\007payload\030\004 \001(\0132\026.google.protobuf.Valu"
          + "eB\003\340A\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001:y\352Av\n\"aiplatform.googleapi"
          + "s.com/DataItem\022Pprojects/{project}/locat"
          + "ions/{location}/datasets/{dataset}/dataI"
          + "tems/{data_item}B\203\001\n$com.google.cloud.ai"
          + "platform.v1alpha1B\rDataItemProtoP\001ZJgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "aiplatform/v1alpha1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1alpha1_DataItem_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1alpha1_DataItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1alpha1_DataItem_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "Labels", "Payload",
            });
    internal_static_google_cloud_aiplatform_v1alpha1_DataItem_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1alpha1_DataItem_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1alpha1_DataItem_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1alpha1_DataItem_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
