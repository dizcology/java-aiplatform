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

// [START aiplatform_list_entity_types_sample]
import com.google.cloud.aiplatform.v1beta1.EntityType;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreName;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceSettings;
import java.io.IOException;

public class ListEntityTypesSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String featurestoreId = "FEATURESTORE_ID";
    listEntityTypesSample(project, location, featurestoreId);
  }

  static void listEntityTypesSample(String project, String location, String featurestoreId)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    FeaturestoreServiceSettings settings =
        FeaturestoreServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient client = FeaturestoreServiceClient.create(settings)) {
      FeaturestoreName parent = FeaturestoreName.of(project, location, featurestoreId);
      for (EntityType entityType : client.listEntityTypes(parent).iterateAll()) {
        System.out.format("entityType: %s\n", entityType);
      }
    }
  }
}

// [END aiplatform_list_entity_types_sample]
