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

// [START aiplatform_create_hyperparameter_tuning_job_python_package_sample]
import com.google.cloud.aiplatform.v1beta1.AcceleratorType;
import com.google.cloud.aiplatform.v1beta1.CustomJobSpec;
import com.google.cloud.aiplatform.v1beta1.HyperparameterTuningJob;
import com.google.cloud.aiplatform.v1beta1.JobServiceClient;
import com.google.cloud.aiplatform.v1beta1.JobServiceSettings;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.MachineSpec;
import com.google.cloud.aiplatform.v1beta1.PythonPackageSpec;
import com.google.cloud.aiplatform.v1beta1.StudySpec;
import com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec;
import java.io.IOException;

public class CreateHyperparameterTuningJobPythonPackageSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String displayName = "DISPLAY_NAME";
    String executorImageUri = "EXECUTOR_IMAGE_URI";
    String packageUri = "PACKAGE_URI";
    String pythonModule = "PYTHON_MODULE";
    createHyperparameterTuningJobPythonPackageSample(
        project, location, displayName, executorImageUri, packageUri, pythonModule);
  }

  static void createHyperparameterTuningJobPythonPackageSample(
      String project,
      String location,
      String displayName,
      String executorImageUri,
      String packageUri,
      String pythonModule)
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
      StudySpec.MetricSpec metric0 =
          StudySpec.MetricSpec.newBuilder()
              .setMetricId("val_rmse")
              .setGoal(StudySpec.MetricSpec.GoalType.MINIMIZE)
              .build();
      StudySpec.ParameterSpec.DiscreteValueSpec discreteValueSpec =
          StudySpec.ParameterSpec.DiscreteValueSpec.newBuilder()
              .addValues(4)
              .addValues(8)
              .addValues(16)
              .addValues(32)
              .addValues(64)
              .addValues(128)
              .build();
      StudySpec.ParameterSpec.DoubleValueSpec doubleValueSpec =
          StudySpec.ParameterSpec.DoubleValueSpec.newBuilder()
              .setMinValue(1e-07)
              .setMaxValue(1)
              .build();
      StudySpec.ParameterSpec parameterSpec =
          StudySpec.ParameterSpec.newBuilder()
              .setParameterId("decay")
              .setDoubleValueSpec(doubleValueSpec)
              .setScaleType(StudySpec.ParameterSpec.ScaleType.UNIT_LINEAR_SCALE)
              .build();
      StudySpec.ParameterSpec.ConditionalParameterSpec.DiscreteValueCondition parentDiscreteValues =
          StudySpec.ParameterSpec.ConditionalParameterSpec.DiscreteValueCondition.newBuilder()
              .addValues(32)
              .addValues(64)
              .build();
      StudySpec.ParameterSpec.ConditionalParameterSpec conditionalParameterSpec0 =
          StudySpec.ParameterSpec.ConditionalParameterSpec.newBuilder()
              .setParameterSpec(parameterSpec)
              .setParentDiscreteValues(parentDiscreteValues)
              .build();
      StudySpec.ParameterSpec.DoubleValueSpec doubleValueSpec =
          StudySpec.ParameterSpec.DoubleValueSpec.newBuilder()
              .setMinValue(1e-07)
              .setMaxValue(1)
              .build();
      StudySpec.ParameterSpec parameterSpec =
          StudySpec.ParameterSpec.newBuilder()
              .setParameterId("learning_rate")
              .setDoubleValueSpec(doubleValueSpec)
              .setScaleType(StudySpec.ParameterSpec.ScaleType.UNIT_LINEAR_SCALE)
              .build();
      StudySpec.ParameterSpec.ConditionalParameterSpec.DiscreteValueCondition parentDiscreteValues =
          StudySpec.ParameterSpec.ConditionalParameterSpec.DiscreteValueCondition.newBuilder()
              .addValues(4)
              .addValues(8)
              .addValues(16)
              .build();
      StudySpec.ParameterSpec.ConditionalParameterSpec conditionalParameterSpec1 =
          StudySpec.ParameterSpec.ConditionalParameterSpec.newBuilder()
              .setParameterSpec(parameterSpec)
              .setParentDiscreteValues(parentDiscreteValues)
              .build();
      StudySpec.ParameterSpec parameter0 =
          StudySpec.ParameterSpec.newBuilder()
              .setParameterId("batch_size")
              .setDiscreteValueSpec(discreteValueSpec)
              .setScaleType(StudySpec.ParameterSpec.ScaleType.UNIT_LINEAR_SCALE)
              .addConditionalParameterSpecs(conditionalParameterSpec0)
              .addConditionalParameterSpecs(conditionalParameterSpec1)
              .build();
      StudySpec studySpec =
          StudySpec.newBuilder()
              .addMetrics(metric0)
              .addParameters(parameter0)
              .setAlgorithm(StudySpec.Algorithm.RANDOM_SEARCH)
              .build();
      MachineSpec machineSpec =
          MachineSpec.newBuilder()
              .setMachineType("n1-standard-4")
              .setAcceleratorType(AcceleratorType.NVIDIA_TESLA_K80)
              .setAcceleratorCount(1)
              .build();
      PythonPackageSpec pythonPackageSpec =
          PythonPackageSpec.newBuilder()
              .setExecutorImageUri(executorImageUri)
              .addPackageUris(packageUri)
              .setPythonModule(pythonModule)
              .build();
      WorkerPoolSpec workerPoolSpec0 =
          WorkerPoolSpec.newBuilder()
              .setMachineSpec(machineSpec)
              .setReplicaCount(1)
              .setPythonPackageSpec(pythonPackageSpec)
              .build();
      CustomJobSpec trialJobSpec =
          CustomJobSpec.newBuilder().addWorkerPoolSpecs(workerPoolSpec0).build();
      // hyperparameter_tuning_job
      HyperparameterTuningJob hyperparameterTuningJob =
          HyperparameterTuningJob.newBuilder()
              .setDisplayName(displayName)
              .setMaxTrialCount(4)
              .setParallelTrialCount(2)
              .setStudySpec(studySpec)
              .setTrialJobSpec(trialJobSpec)
              .build();
      LocationName parent = LocationName.of(project, location);
      HyperparameterTuningJob response =
          client.createHyperparameterTuningJob(parent, hyperparameterTuningJob);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_create_hyperparameter_tuning_job_python_package_sample]
