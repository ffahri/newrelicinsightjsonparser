
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
    "name",
    "total",
    "timeSeries"
})
public class Facet {

    @JsonProperty("name")
    private String name;
    @JsonProperty("total")
    private com.webischia.jackson.Total total;
    @JsonProperty("timeSeries")
    private List<com.webischia.jackson.TimeSeries> timeSeries = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("total")
    public com.webischia.jackson.Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(com.webischia.jackson.Total total) {
        this.total = total;
    }

    @JsonProperty("timeSeries")
    public List<com.webischia.jackson.TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    @JsonProperty("timeSeries")
    public void setTimeSeries(List<com.webischia.jackson.TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
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
