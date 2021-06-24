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

// [START aiplatform_get_entity_type_sample]
import com.google.cloud.aiplatform.v1beta1.EntityType;
import com.google.cloud.aiplatform.v1beta1.EntityTypeName;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceSettings;
import java.io.IOException;

public class GetEntityTypeSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String featurestoreId = "FEATURESTORE_ID";
    String entityTypeId = "ENTITY_TYPE_ID";
    getEntityTypeSample(project, location, featurestoreId, entityTypeId);
  }

  static void getEntityTypeSample(
      String project, String location, String featurestoreId, String entityTypeId)
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
      EntityTypeName name = EntityTypeName.of(project, location, featurestoreId, entityTypeId);
      EntityType response = client.getEntityType(name);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_get_entity_type_sample]
