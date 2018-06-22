
package com.webischia.jackson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "results",
    "beginTimeSeconds",
    "endTimeSeconds",
    "inspectedCount"
})
public class TimeSeries {

    @JsonProperty("results")
    private List<com.webischia.jackson.Result> results = null;
    @JsonProperty("beginTimeSeconds")
    private Long beginTimeSeconds;
    @JsonProperty("endTimeSeconds")
    private Long endTimeSeconds;
    @JsonProperty("inspectedCount")
    private int inspectedCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public List<com.webischia.jackson.Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<com.webischia.jackson.Result> results) {
        this.results = results;
    }

    @JsonProperty("beginTimeSeconds")
    public Long getBeginTimeSeconds() {
        return beginTimeSeconds;
    }

    @JsonProperty("beginTimeSeconds")
    public void setBeginTimeSeconds(Long beginTimeSeconds) {
        this.beginTimeSeconds = beginTimeSeconds;
    }

    @JsonProperty("endTimeSeconds")
    public Long getEndTimeSeconds() {
        return endTimeSeconds;
    }

    @JsonProperty("endTimeSeconds")
    public void setEndTimeSeconds(Long endTimeSeconds) {
        this.endTimeSeconds = endTimeSeconds;
    }

    @JsonProperty("inspectedCount")
    public int getInspectedCount() {
        return inspectedCount;
    }

    @JsonProperty("inspectedCount")
    public void setInspectedCount(int inspectedCount) {
        this.inspectedCount = inspectedCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
