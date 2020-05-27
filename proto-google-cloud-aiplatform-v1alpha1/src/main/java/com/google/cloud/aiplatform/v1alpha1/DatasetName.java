/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1alpha1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DatasetName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/datasets/{dataset}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String dataset;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDataset() {
    return dataset;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DatasetName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dataset = Preconditions.checkNotNull(builder.getDataset());
  }

  public static DatasetName of(String project, String location, String dataset) {
    return newBuilder().setProject(project).setLocation(location).setDataset(dataset).build();
  }

  public static String format(String project, String location, String dataset) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setDataset(dataset)
        .build()
        .toString();
  }

  public static DatasetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "DatasetName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("dataset"));
  }

  public static List<DatasetName> parseList(List<String> formattedStrings) {
    List<DatasetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DatasetName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DatasetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("dataset", dataset);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "location", location, "dataset", dataset);
  }

  /** Builder for DatasetName. */
  public static class Builder {

    private String project;
    private String location;
    private String dataset;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDataset() {
      return dataset;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDataset(String dataset) {
      this.dataset = dataset;
      return this;
    }

    private Builder() {}

    private Builder(DatasetName datasetName) {
      project = datasetName.project;
      location = datasetName.location;
      dataset = datasetName.dataset;
    }

    public DatasetName build() {
      return new DatasetName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatasetName) {
      DatasetName that = (DatasetName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.dataset.equals(that.dataset));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= dataset.hashCode();
    return h;
  }
}
