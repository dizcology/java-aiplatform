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

// [START aiplatform_update_dataset_sample]
import com.google.cloud.aiplatform.v1beta1.Dataset;
import com.google.cloud.aiplatform.v1beta1.DatasetServiceClient;
import com.google.cloud.aiplatform.v1beta1.DatasetServiceSettings;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class UpdateDatasetSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String datasetId = "DATASET_ID";
    String newDisplayName = "NEW_DISPLAY_NAME";
    updateDatasetSample(datasetId, newDisplayName);
  }

  static void updateDatasetSample(String datasetId, String newDisplayName) throws IOException {
    // The AI Platform services require regional API endpoints.
    DatasetServiceSettings settings =
        DatasetServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DatasetServiceClient client = DatasetServiceClient.create(settings)) {
      String datasetName = DatasetName.of(project, location, datasetId).toString();
      Dataset dataset =
          Dataset.newBuilder().setName(datasetName).setDisplayName(newDisplayName).build();
      FieldMask updateMask = FieldMask.newBuilder().addPaths("display_name").build();
      Dataset response = client.updateDataset(dataset, updateMask);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_update_dataset_sample]
