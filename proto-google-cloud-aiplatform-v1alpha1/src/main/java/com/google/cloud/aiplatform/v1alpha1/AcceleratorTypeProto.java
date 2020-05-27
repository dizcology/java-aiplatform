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
// source: google/cloud/aiplatform/v1alpha1/accelerator_type.proto

package com.google.cloud.aiplatform.v1alpha1;

public final class AcceleratorTypeProto {
  private AcceleratorTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1alpha1/accel"
          + "erator_type.proto\022 google.cloud.aiplatfo"
          + "rm.v1alpha1\032\034google/api/annotations.prot"
          + "o*\271\001\n\017AcceleratorType\022 \n\034ACCELERATOR_TYP"
          + "E_UNSPECIFIED\020\000\022\024\n\020NVIDIA_TESLA_K80\020\001\022\025\n"
          + "\021NVIDIA_TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V10"
          + "0\020\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA"
          + "_T4\020\005\022\n\n\006TPU_V2\020\006\022\n\n\006TPU_V3\020\007B\212\001\n$com.go"
          + "ogle.cloud.aiplatform.v1alpha1B\024Accelera"
          + "torTypeProtoP\001ZJgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1alpha1;"
          + "aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
