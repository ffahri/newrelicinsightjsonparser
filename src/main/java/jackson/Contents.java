
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
    "messages",
    "timeSeries",
    "bucketSizeMillis"
})
public class Contents {

    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonProperty("timeSeries")
    private com.webischia.jackson.TimeSeries timeSeries;
    @JsonProperty("bucketSizeMillis")
    private int bucketSizeMillis;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("messages")
    public List<Object> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    @JsonProperty("timeSeries")
    public com.webischia.jackson.TimeSeries getTimeSeries() {
        return timeSeries;
    }

    @JsonProperty("timeSeries")
    public void setTimeSeries(com.webischia.jackson.TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    @JsonProperty("bucketSizeMillis")
    public int getBucketSizeMillis() {
        return bucketSizeMillis;
    }

    @JsonProperty("bucketSizeMillis")
    public void setBucketSizeMillis(int bucketSizeMillis) {
        this.bucketSizeMillis = bucketSizeMillis;
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
