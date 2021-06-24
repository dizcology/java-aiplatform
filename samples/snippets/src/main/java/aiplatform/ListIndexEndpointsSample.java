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

// [START aiplatform_list_index_endpoints_sample]
import com.google.cloud.aiplatform.v1beta1.IndexEndpoint;
import com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceClient;
import com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import java.io.IOException;

public class ListIndexEndpointsSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    listIndexEndpointsSample(project, location);
  }

  static void listIndexEndpointsSample(String project, String location) throws IOException {
    // The AI Platform services require regional API endpoints.
    IndexEndpointServiceSettings settings =
        IndexEndpointServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (IndexEndpointServiceClient client = IndexEndpointServiceClient.create(settings)) {
      LocationName parent = LocationName.of(project, location);
      for (IndexEndpoint indexEndpoint : client.listIndexEndpoints(parent).iterateAll()) {
        System.out.format("indexEndpoint: %s\n", indexEndpoint);
      }
    }
  }
}

// [END aiplatform_list_index_endpoints_sample]
