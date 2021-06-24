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

// [START aiplatform_upload_model_sample]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.ModelContainerSpec;
import com.google.cloud.aiplatform.v1beta1.ModelServiceClient;
import com.google.cloud.aiplatform.v1beta1.ModelServiceSettings;
import com.google.cloud.aiplatform.v1beta1.UploadModelOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UploadModelResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class UploadModelSample {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String metadataSchemaUri = "METADATA_SCHEMA_URI";
    String imageUri = "IMAGE_URI";
    String artifactUri = "ARTIFACT_URI";
    uploadModelSample(project, location, displayName, metadataSchemaUri, imageUri, artifactUri);
  }

  static void uploadModelSample(
      String project,
      String location,
      String displayName,
      String metadataSchemaUri,
      String imageUri,
      String artifactUri)
      throws IOException, ExecutionException, InterruptedException {
    // The AI Platform services require regional API endpoints.
    ModelServiceSettings settings =
        ModelServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ModelServiceClient client = ModelServiceClient.create(settings)) {
      ModelContainerSpec containerSpec =
          ModelContainerSpec.newBuilder()
              .setImageUri(imageUri)
              .setPredictRoute("")
              .setHealthRoute("")
              .build();
      Model model =
          Model.newBuilder()
              .setDisplayName(displayName)
              .setMetadataSchemaUri(metadataSchemaUri)
              // The artifact_uri should be the path to a GCS directory containing
              // saved model artifacts.  The bucket must be accessible for the
              // project's AI Platform service account and in the same region as
              // the api endpoint.
              .setArtifactUri(artifactUri)
              .setContainerSpec(containerSpec)
              .build();
      LocationName parent = LocationName.of(project, location);
      OperationFuture<UploadModelResponse, UploadModelOperationMetadata> response =
          client.uploadModelAsync(parent, model);

      // You can use OperationFuture.getInitialFuture to get a future representing the initial
      // response to the request, which contains information while the operation is in progress.
      System.out.format("Operation name: %s\n", response.getInitialFuture().get().getName());

      // OperationFuture.get() will block until the operation is finished.
      UploadModelResponse uploadModelResponse = response.get();
      System.out.format("uploadModelResponse: %s\n", uploadModelResponse);
    }
  }
}

// [END aiplatform_upload_model_sample]
