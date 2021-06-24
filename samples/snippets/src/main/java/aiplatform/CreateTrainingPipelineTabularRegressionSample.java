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

// [START aiplatform_create_training_pipeline_tabular_regression_sample]
import com.google.cloud.aiplatform.v1beta1.FractionSplit;
import com.google.cloud.aiplatform.v1beta1.InputDataConfig;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceClient;
import com.google.cloud.aiplatform.v1beta1.PipelineServiceSettings;
import com.google.cloud.aiplatform.v1beta1.TrainingPipeline;
import com.google.gson.JsonObject;
import java.io.IOException;

public class CreateTrainingPipelineTabularRegressionSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String datasetId = "DATASET_ID";
    String modelDisplayName = "MODEL_DISPLAY_NAME";
    String targetColumn = "TARGET_COLUMN";
    createTrainingPipelineTabularRegressionSample(
        project, location, displayName, datasetId, modelDisplayName, targetColumn);
  }

  static void createTrainingPipelineTabularRegressionSample(
      String project,
      String location,
      String displayName,
      String datasetId,
      String modelDisplayName,
      String targetColumn)
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
      // TODO: build transformations here
      JsonObject jsonTrainingTaskInputs = new JsonObject();
      // required inputs
      jsonTrainingTaskInputs.addProperty("targetColumn", targetColumn);
      jsonTrainingTaskInputs.addProperty("predictionType", "regression");
      jsonTrainingTaskInputs.addProperty("transformations", jsonTransformations);
      jsonTrainingTaskInputs.addProperty("trainBudgetMilliNodeHours", 8000);
      // optional inputs
      jsonTrainingTaskInputs.addProperty("disableEarlyStopping", false);
      // supported regression optimisation objectives: minimize-rmse,
      // minimize-mae, minimize-rmsle
      jsonTrainingTaskInputs.addProperty("optimizationObjective", "minimize-rmse");
      FractionSplit fractionSplit =
          FractionSplit.newBuilder()
              .setTrainingFraction(0.8)
              .setValidationFraction(0.1)
              .setTestFraction(0.1)
              .build();
      InputDataConfig inputDataConfig =
          InputDataConfig.newBuilder()
              .setDatasetId(datasetId)
              .setFractionSplit(fractionSplit)
              .build();
      Model modelToUpload = Model.newBuilder().setDisplayName(modelDisplayName).build();
      TrainingPipeline trainingPipeline =
          TrainingPipeline.newBuilder()
              .setDisplayName(displayName)
              .setTrainingTaskDefinition(
                  "gs://google-cloud-aiplatform/schema/trainingjob/definition/automl_tabular_1.0.0.yaml")
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

// [END aiplatform_create_training_pipeline_tabular_regression_sample]
