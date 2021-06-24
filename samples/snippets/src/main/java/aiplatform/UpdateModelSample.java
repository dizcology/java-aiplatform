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

// [START aiplatform_update_model_sample]
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.ModelServiceClient;
import com.google.cloud.aiplatform.v1beta1.ModelServiceSettings;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class UpdateModelSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String modelId = "MODEL_ID";
    String newDisplayName = "NEW_DISPLAY_NAME";
    updateModelSample(modelId, newDisplayName);
  }

  static void updateModelSample(String modelId, String newDisplayName) throws IOException {
    // The AI Platform services require regional API endpoints.
    ModelServiceSettings settings =
        ModelServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ModelServiceClient client = ModelServiceClient.create(settings)) {
      String modelName = ModelName.of(project, location, modelId).toString();
      Model model = Model.newBuilder().setName(modelName).setDisplayName(newDisplayName).build();
      FieldMask updateMask = FieldMask.newBuilder().addPaths("display_name").build();
      Model response = client.updateModel(model, updateMask);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_update_model_sample]
