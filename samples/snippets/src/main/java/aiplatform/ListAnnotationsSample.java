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

// [START aiplatform_list_annotations_sample]
import com.google.cloud.aiplatform.v1beta1.Annotation;
import com.google.cloud.aiplatform.v1beta1.DataItemName;
import com.google.cloud.aiplatform.v1beta1.DatasetServiceClient;
import com.google.cloud.aiplatform.v1beta1.DatasetServiceSettings;
import java.io.IOException;

public class ListAnnotationsSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String datasetId = "DATASET_ID";
    String dataItemId = "DATA_ITEM_ID";
    listAnnotationsSample(project, location, datasetId, dataItemId);
  }

  static void listAnnotationsSample(
      String project, String location, String datasetId, String dataItemId) throws IOException {
    // The AI Platform services require regional API endpoints.
    DatasetServiceSettings settings =
        DatasetServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DatasetServiceClient client = DatasetServiceClient.create(settings)) {
      DataItemName parent = DataItemName.of(project, location, datasetId, dataItemId);
      for (Annotation annotation : client.listAnnotations(parent).iterateAll()) {
        System.out.format("annotation: %s\n", annotation);
      }
    }
  }
}

// [END aiplatform_list_annotations_sample]
