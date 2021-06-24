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

// [START aiplatform_batch_read_feature_values_sample]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.BatchReadFeatureValuesOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.BatchReadFeatureValuesResponse;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreName;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceSettings;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class BatchReadFeatureValuesSample {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String featurestoreId = "FEATURESTORE_ID";
    batchReadFeatureValuesSample(project, location, featurestoreId);
  }

  static void batchReadFeatureValuesSample(String project, String location, String featurestoreId)
      throws IOException, ExecutionException, InterruptedException {
    // The AI Platform services require regional API endpoints.
    FeaturestoreServiceSettings settings =
        FeaturestoreServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (FeaturestoreServiceClient client = FeaturestoreServiceClient.create(settings)) {
      FeaturestoreName featurestore = FeaturestoreName.of(project, location, featurestoreId);
      OperationFuture<BatchReadFeatureValuesResponse, BatchReadFeatureValuesOperationMetadata>
          response = client.batchReadFeatureValuesAsync(featurestore);

      // You can use OperationFuture.getInitialFuture to get a future representing the initial
      // response to the request, which contains information while the operation is in progress.
      System.out.format("Operation name: %s\n", response.getInitialFuture().get().getName());

      // OperationFuture.get() will block until the operation is finished.
      BatchReadFeatureValuesResponse batchReadFeatureValuesResponse = response.get();
      System.out.format("batchReadFeatureValuesResponse: %s\n", batchReadFeatureValuesResponse);
    }
  }
}

// [END aiplatform_batch_read_feature_values_sample]
