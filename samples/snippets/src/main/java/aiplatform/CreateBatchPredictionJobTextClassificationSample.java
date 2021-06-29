/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aiplatform;

// [START aiplatform_create_batch_prediction_job_text_classification_sample]
import com.google.cloud.aiplatform.v1beta1.BatchPredictionJob;
import com.google.cloud.aiplatform.v1beta1.GcsDestination;
import com.google.cloud.aiplatform.v1beta1.GcsSource;
import com.google.cloud.aiplatform.v1beta1.JobServiceClient;
import com.google.cloud.aiplatform.v1beta1.JobServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.gson.JsonObject;
import java.io.IOException;

public class CreateBatchPredictionJobTextClassificationSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String modelId = "MODEL_ID";
    String gcsSourceUri = "GCS_SOURCE_URI";
    String gcsDestinationOutputUriPrefix = "GCS_DESTINATION_OUTPUT_URI_PREFIX";
    createBatchPredictionJobTextClassificationSample(
        project, location, displayName, modelId, gcsSourceUri, gcsDestinationOutputUriPrefix);
  }

  static void createBatchPredictionJobTextClassificationSample(
      String project,
      String location,
      String displayName,
      String modelId,
      String gcsSourceUri,
      String gcsDestinationOutputUriPrefix)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    JobServiceSettings settings =
        JobServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (JobServiceClient client = JobServiceClient.create(settings)) {
      String modelName = ModelName.of(project, location, modelId).toString();
      JsonObject jsonModelParameters = new JsonObject();
      GcsSource gcsSource = GcsSource.newBuilder().addUris(gcsSourceUri).build();
      BatchPredictionJob.InputConfig inputConfig =
          BatchPredictionJob.InputConfig.newBuilder()
              .setInstancesFormat("jsonl")
              .setGcsSource(gcsSource)
              .build();
      GcsDestination gcsDestination =
          GcsDestination.newBuilder().setOutputUriPrefix(gcsDestinationOutputUriPrefix).build();
      BatchPredictionJob.OutputConfig outputConfig =
          BatchPredictionJob.OutputConfig.newBuilder()
              .setPredictionsFormat("jsonl")
              .setGcsDestination(gcsDestination)
              .build();
      BatchPredictionJob batchPredictionJob =
          BatchPredictionJob.newBuilder()
              .setDisplayName(displayName)
              .setModel(modelName)
              .setModelParameters(modelParameters)
              .setInputConfig(inputConfig)
              .setOutputConfig(outputConfig)
              .build();
      LocationName parent = LocationName.of(project, location);
      BatchPredictionJob response = client.createBatchPredictionJob(parent, batchPredictionJob);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_batch_prediction_job_text_classification_sample]
