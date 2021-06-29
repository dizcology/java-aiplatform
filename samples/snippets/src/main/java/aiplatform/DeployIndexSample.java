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

// [START aiplatform_deploy_index_sample]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.DeployIndexOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.DeployIndexResponse;
import com.google.cloud.aiplatform.v1beta1.DeployedIndex;
import com.google.cloud.aiplatform.v1beta1.IndexEndpointName;
import com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceClient;
import com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceSettings;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class DeployIndexSample {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String indexEndpointId = "INDEX_ENDPOINT_ID";
    String displayName = "DISPLAY_NAME";
    deployIndexSample(project, location, indexEndpointId, displayName);
  }

  static void deployIndexSample(
      String project, String location, String indexEndpointId, String displayName)
      throws IOException, ExecutionException, InterruptedException {
    // The AI Platform services require regional API endpoints.
    IndexEndpointServiceSettings settings =
        IndexEndpointServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (IndexEndpointServiceClient client = IndexEndpointServiceClient.create(settings)) {
      DeployedIndex deployedIndex = DeployedIndex.newBuilder().setDisplayName(displayName).build();
      IndexEndpointName indexEndpoint = IndexEndpointName.of(project, location, indexEndpointId);
      OperationFuture<DeployIndexResponse, DeployIndexOperationMetadata> response =
          client.deployIndexAsync(indexEndpoint, deployedIndex);

      // You can use OperationFuture.getInitialFuture to get a future representing the initial
      // response to the request, which contains information while the operation is in progress.
      System.out.format("Operation name: %s\n", response.getInitialFuture().get().getName());

      // OperationFuture.get() will block until the operation is finished.
      DeployIndexResponse deployIndexResponse = response.get();
      System.out.format("deployIndexResponse: %s\n", deployIndexResponse);
    }
  }
}

// [END aiplatform_deploy_index_sample]
