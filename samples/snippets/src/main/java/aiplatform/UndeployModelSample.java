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

// [START aiplatform_undeploy_model_sample]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.EndpointName;
import com.google.cloud.aiplatform.v1beta1.EndpointServiceClient;
import com.google.cloud.aiplatform.v1beta1.EndpointServiceSettings;
import com.google.cloud.aiplatform.v1beta1.UndeployModelOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UndeployModelResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class UndeployModelSample {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String endpointId = "ENDPOINT_ID";
    String deployedModelId = "DEPLOYED_MODEL_ID";
    undeployModelSample(project, location, endpointId, deployedModelId);
  }

  static void undeployModelSample(
      String project, String location, String endpointId, String deployedModelId)
      throws IOException, ExecutionException, InterruptedException {
    // The AI Platform services require regional API endpoints.
    EndpointServiceSettings settings =
        EndpointServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (EndpointServiceClient client = EndpointServiceClient.create(settings)) {
      // If after the undeployment there is at least one deployed model remaining in the endpoint,
      // traffic_split should be set to a mapping from remaining deployed models' ids to integer
      // percentages that sum to 100.
      Map<String, Integer> trafficSplit = new HashMap<>();
      EndpointName endpoint = EndpointName.of(project, location, endpointId);
      OperationFuture<UndeployModelResponse, UndeployModelOperationMetadata> response =
          client.undeployModelAsync(endpoint, deployedModelId, trafficSplit);

      // You can use OperationFuture.getInitialFuture to get a future representing the initial
      // response to the request, which contains information while the operation is in progress.
      System.out.format("Operation name: %s\n", response.getInitialFuture().get().getName());

      // OperationFuture.get() will block until the operation is finished.
      UndeployModelResponse undeployModelResponse = response.get();
      System.out.format("undeployModelResponse: %s\n", undeployModelResponse);
    }
  }
}

// [END aiplatform_undeploy_model_sample]
