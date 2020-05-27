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

public interface DedicatedResourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.DedicatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1alpha1.MachineSpec getMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine used by the prediction.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1alpha1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The minimum number of machine replicas this DeployedModel will be always
   * deployed on. If traffic against it increases, it may dynamically be
   * deployed onto more replicas, and as traffic decreases, some of these extra
   * replicas may be freed.
   * Note: if [machine_spec.accelerator_count][google.cloud.aiplatform.v1alpha1.MachineSpec.accelerator_count] is
   * above 0, currently the model will be always deployed precisely on
   * [min_replica_count][google.cloud.aiplatform.v1alpha1.DedicatedResources.min_replica_count].
   * </pre>
   *
   * <code>
   * int32 min_replica_count = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The minReplicaCount.
   */
  int getMinReplicaCount();
}
