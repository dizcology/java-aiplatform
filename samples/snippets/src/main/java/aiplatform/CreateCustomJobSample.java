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

// [START aiplatform_create_custom_job_sample]
import com.google.cloud.aiplatform.v1beta1.AcceleratorType;
import com.google.cloud.aiplatform.v1beta1.ContainerSpec;
import com.google.cloud.aiplatform.v1beta1.CustomJob;
import com.google.cloud.aiplatform.v1beta1.CustomJobSpec;
import com.google.cloud.aiplatform.v1beta1.JobServiceClient;
import com.google.cloud.aiplatform.v1beta1.JobServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.MachineSpec;
import com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec;
import java.io.IOException;

public class CreateCustomJobSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String containerImageUri = "CONTAINER_IMAGE_URI";
    createCustomJobSample(project, location, displayName, containerImageUri);
  }

  static void createCustomJobSample(
      String project, String location, String displayName, String containerImageUri)
      throws IOException {
    // The AI Platform services require regional API endpoints.
    JobServiceSettings settings =
        JobServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (JobServiceClient client = JobServiceClient.create(settings)) {
      MachineSpec machineSpec =
          MachineSpec.newBuilder()
              .setMachineType("n1-standard-4")
              .setAcceleratorType(AcceleratorType.NVIDIA_TESLA_K80)
              .setAcceleratorCount(1)
              .build();
      ContainerSpec containerSpec =
          ContainerSpec.newBuilder().setImageUri(containerImageUri).build();
      WorkerPoolSpec workerPoolSpec0 =
          WorkerPoolSpec.newBuilder()
              .setMachineSpec(machineSpec)
              .setReplicaCount(1)
              .setContainerSpec(containerSpec)
              .build();
      CustomJobSpec jobSpec =
          CustomJobSpec.newBuilder().addWorkerPoolSpecs(workerPoolSpec0).build();
      CustomJob customJob =
          CustomJob.newBuilder().setDisplayName(displayName).setJobSpec(jobSpec).build();
      LocationName parent = LocationName.of(project, location);
      CustomJob response = client.createCustomJob(parent, customJob);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_custom_job_sample]
