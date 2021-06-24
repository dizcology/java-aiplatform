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

// [START aiplatform_list_tensorboard_runs_sample]
import com.google.cloud.aiplatform.v1beta1.TensorboardExperimentName;
import com.google.cloud.aiplatform.v1beta1.TensorboardRun;
import com.google.cloud.aiplatform.v1beta1.TensorboardServiceClient;
import com.google.cloud.aiplatform.v1beta1.TensorboardServiceSettings;
import java.io.IOException;

public class ListTensorboardRunsSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String tensorboardId = "TENSORBOARD_ID";
    String experimentId = "EXPERIMENT_ID";
    listTensorboardRunsSample(project, location, tensorboardId, experimentId);
  }

  static void listTensorboardRunsSample(
      String project, String location, String tensorboardId, String experimentId)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    TensorboardServiceSettings settings =
        TensorboardServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (TensorboardServiceClient client = TensorboardServiceClient.create(settings)) {
      TensorboardExperimentName parent =
          TensorboardExperimentName.of(project, location, tensorboardId, experimentId);
      for (TensorboardRun tensorboardRun : client.listTensorboardRuns(parent).iterateAll()) {
        System.out.format("tensorboardRun: %s\n", tensorboardRun);
      }
    }
  }
}

// [END aiplatform_list_tensorboard_runs_sample]
