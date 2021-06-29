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

// [START aiplatform_predict_text_sentiment_analysis_sample]
import com.google.cloud.aiplatform.v1beta1.EndpointName;
import com.google.cloud.aiplatform.v1beta1.PredictResponse;
import com.google.cloud.aiplatform.v1beta1.PredictionServiceClient;
import com.google.cloud.aiplatform.v1beta1.PredictionServiceSettings;
import com.google.cloud.aiplatform.v1beta1.schema.predict.instance.TextSentimentPredictionInstance;
import com.google.gson.JsonObject;
import com.google.protobuf.Value;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PredictTextSentimentAnalysisSample {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String project = "PROJECT";
    String location = "us-central1";
    String endpointId = "ENDPOINT_ID";
    String content = "CONTENT";
    predictTextSentimentAnalysisSample(project, location, endpointId, content);
  }

  static void predictTextSentimentAnalysisSample(
      String project, String location, String endpointId, String content) throws IOException {
    // The AI Platform services require regional API endpoints.
    PredictionServiceSettings settings =
        PredictionServiceSettings.newBuilder()
            .setEndpoint("us-central1-aiplatform.googleapis.com:443")
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (PredictionServiceClient client = PredictionServiceClient.create(settings)) {
      TextSentimentPredictionInstance instance =
          TextSentimentPredictionInstance.newBuilder().setContent(content).build();
      List<Value> instances = new ArrayList<>();
      instances.add(instance);
      JsonObject jsonParameters = new JsonObject();
      EndpointName endpoint = EndpointName.of(project, location, endpointId);
      PredictResponse response = client.predict(endpoint, instances, parameters);
      System.out.format("response: %s\n", response);
    }
  }
}

// [END aiplatform_predict_text_sentiment_analysis_sample]
