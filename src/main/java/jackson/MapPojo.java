
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
    "facets",
    "totalResult",
    "unknownGroup",
    "metadata"
})
public class MapPojo {

    @JsonProperty("facets")
    private List<com.webischia.jackson.Facet> facets = null;
    @JsonProperty("totalResult")
    private com.webischia.jackson.TotalResult totalResult;
    @JsonProperty("unknownGroup")
    private com.webischia.jackson.UnknownGroup unknownGroup;
    @JsonProperty("metadata")
    private com.webischia.jackson.Metadata metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("facets")
    public List<com.webischia.jackson.Facet> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<com.webischia.jackson.Facet> facets) {
        this.facets = facets;
    }

    @JsonProperty("totalResult")
    public com.webischia.jackson.TotalResult getTotalResult() {
        return totalResult;
    }

    @JsonProperty("totalResult")
    public void setTotalResult(com.webischia.jackson.TotalResult totalResult) {
        this.totalResult = totalResult;
    }

    @JsonProperty("unknownGroup")
    public com.webischia.jackson.UnknownGroup getUnknownGroup() {
        return unknownGroup;
    }

    @JsonProperty("unknownGroup")
    public void setUnknownGroup(com.webischia.jackson.UnknownGroup unknownGroup) {
        this.unknownGroup = unknownGroup;
    }

    @JsonProperty("metadata")
    public com.webischia.jackson.Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(com.webischia.jackson.Metadata metadata) {
        this.metadata = metadata;
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
