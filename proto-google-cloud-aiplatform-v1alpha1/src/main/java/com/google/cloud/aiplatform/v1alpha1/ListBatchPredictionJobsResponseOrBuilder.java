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
// source: google/cloud/aiplatform/v1alpha1/job_service.proto

package com.google.cloud.aiplatform.v1alpha1;

public interface ListBatchPredictionJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1alpha1.BatchPredictionJob batch_prediction_jobs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob>
      getBatchPredictionJobsList();
  /**
   *
   *
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1alpha1.BatchPredictionJob batch_prediction_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.BatchPredictionJob getBatchPredictionJobs(int index);
  /**
   *
   *
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1alpha1.BatchPredictionJob batch_prediction_jobs = 1;
   * </code>
   */
  int getBatchPredictionJobsCount();
  /**
   *
   *
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1alpha1.BatchPredictionJob batch_prediction_jobs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1alpha1.BatchPredictionJobOrBuilder>
      getBatchPredictionJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1alpha1.BatchPredictionJob batch_prediction_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1alpha1.BatchPredictionJobOrBuilder getBatchPredictionJobsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListBatchPredictionJobsRequest.page_token][google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest.page_token] to obtain that
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListBatchPredictionJobsRequest.page_token][google.cloud.aiplatform.v1alpha1.ListBatchPredictionJobsRequest.page_token] to obtain that
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
