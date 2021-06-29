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

// [START aiplatform_create_training_pipeline_sample]
import com.google.cloud.aiplatform.v1beta1.InputDataConfig;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceClient;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceSettings;
import com.google.cloud.aiplatform.v1beta1.TrainingPipeline;
import com.google.gson.JsonObject;
import java.io.IOException;

public class CreateTrainingPipelineSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String trainingTaskDefinition = "TRAINING_TASK_DEFINITION";
    String datasetId = "DATASET_ID";
    String modelDisplayName = "MODEL_DISPLAY_NAME";
    createTrainingPipelineSample(
        project, location, displayName, trainingTaskDefinition, datasetId, modelDisplayName);
  }

  static void createTrainingPipelineSample(
      String project,
      String location,
      String displayName,
      String trainingTaskDefinition,
      String datasetId,
      String modelDisplayName)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    PipelineServiceSettings settings =
        PipelineServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PipelineServiceClient client = PipelineServiceClient.create(settings)) {
      JsonObject jsonTrainingTaskInputs = new JsonObject();
      jsonTrainingTaskInputs.addProperty("multiLabel", true);
      jsonTrainingTaskInputs.addProperty("modelType", "CLOUD");
      jsonTrainingTaskInputs.addProperty("budgetMilliNodeHours", 8000);
      jsonTrainingTaskInputs.addProperty("disableEarlyStopping", false);
      InputDataConfig inputDataConfig =
          InputDataConfig.newBuilder().setDatasetId(datasetId).build();
      Model modelToUpload = Model.newBuilder().setDisplayName(modelDisplayName).build();
      TrainingPipeline trainingPipeline =
          TrainingPipeline.newBuilder()
              .setDisplayName(displayName)
              .setTrainingTaskDefinition(trainingTaskDefinition)
              .setTrainingTaskInputs(trainingTaskInputs)
              .setInputDataConfig(inputDataConfig)
              .setModelToUpload(modelToUpload)
              .build();
      LocationName parent = LocationName.of(project, location);
      TrainingPipeline response = client.createTrainingPipeline(parent, trainingPipeline);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_training_pipeline_sample]
