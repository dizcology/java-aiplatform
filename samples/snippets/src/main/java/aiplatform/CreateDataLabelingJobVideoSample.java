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

// [START aiplatform_create_data_labeling_job_video_sample]
import com.google.cloud.aiplatform.v1beta1.DataLabelingJob;
import com.google.cloud.aiplatform.v1beta1.JobServiceClient;
import com.google.cloud.aiplatform.v1beta1.JobServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;

public class CreateDataLabelingJobVideoSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String dataset = "DATASET";
    String instructionUri = "INSTRUCTION_URI";
    String annotationSpec = "ANNOTATION_SPEC";
    createDataLabelingJobVideoSample(
        project, location, displayName, dataset, instructionUri, annotationSpec);
  }

  static void createDataLabelingJobVideoSample(
      String project,
      String location,
      String displayName,
      String dataset,
      String instructionUri,
      String annotationSpec)
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
      JsonArray jsonAnnotationSpecs = new JsonArray();
      jsonAnnotationSpecs.add(annotationSpec);
      JsonObject jsonInputs = new JsonObject();
      jsonInputs.add("annotation_specs", jsonAnnotationSpecs);
      DataLabelingJob dataLabelingJob =
          DataLabelingJob.newBuilder()
              .setDisplayName(displayName)
              // Full resource name:
              // projects/{project_id}/locations/{location}/datasets/{dataset_id}
              .addDatasets(dataset)
              // labeler_count must be 1, 3, or 5
              .setLabelerCount(1)
              .setInstructionUri(instructionUri)
              .setInputsSchemaUri(
                  "gs://google-cloud-aiplatform/schema/datalabelingjob/inputs/video_classification_1.0.0.yaml")
              .setInputs(inputs)
              .putAnnotationLabels(
                  "aiplatform.googleapis.com/annotation_set_name", "my_test_saved_query")
              .build();
      LocationName parent = LocationName.of(project, location);
      DataLabelingJob response = client.createDataLabelingJob(parent, dataLabelingJob);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_data_labeling_job_video_sample]
