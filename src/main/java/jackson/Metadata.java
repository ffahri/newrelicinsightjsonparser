
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
    "eventTypes",
    "eventType",
    "openEnded",
    "beginTime",
    "endTime",
    "beginTimeMillis",
    "endTimeMillis",
    "rawSince",
    "rawUntil",
    "rawCompareWith",
    "guid",
    "routerGuid",
    "messages",
    "facet",
    "offset",
    "limit",
    "contents"
})
public class Metadata {

    @JsonProperty("eventTypes")
    private List<String> eventTypes = null;
    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("openEnded")
    private boolean openEnded;
    @JsonProperty("beginTime")
    private String beginTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("beginTimeMillis")
    private Long beginTimeMillis;
    @JsonProperty("endTimeMillis")
    private Long endTimeMillis;
    @JsonProperty("rawSince")
    private String rawSince;
    @JsonProperty("rawUntil")
    private String rawUntil;
    @JsonProperty("rawCompareWith")
    private String rawCompareWith;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("routerGuid")
    private String routerGuid;
    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonProperty("facet")
    private String facet;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("contents")
    private com.webischia.jackson.Contents contents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eventTypes")
    public List<String> getEventTypes() {
        return eventTypes;
    }

    @JsonProperty("eventTypes")
    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("openEnded")
    public boolean isOpenEnded() {
        return openEnded;
    }

    @JsonProperty("openEnded")
    public void setOpenEnded(boolean openEnded) {
        this.openEnded = openEnded;
    }

    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("beginTimeMillis")
    public Long getBeginTimeMillis() {
        return beginTimeMillis;
    }

    @JsonProperty("beginTimeMillis")
    public void setBeginTimeMillis(Long beginTimeMillis) {
        this.beginTimeMillis = beginTimeMillis;
    }

    @JsonProperty("endTimeMillis")
    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    @JsonProperty("endTimeMillis")
    public void setEndTimeMillis(Long endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
    }

    @JsonProperty("rawSince")
    public String getRawSince() {
        return rawSince;
    }

    @JsonProperty("rawSince")
    public void setRawSince(String rawSince) {
        this.rawSince = rawSince;
    }

    @JsonProperty("rawUntil")
    public String getRawUntil() {
        return rawUntil;
    }

    @JsonProperty("rawUntil")
    public void setRawUntil(String rawUntil) {
        this.rawUntil = rawUntil;
    }

    @JsonProperty("rawCompareWith")
    public String getRawCompareWith() {
        return rawCompareWith;
    }

    @JsonProperty("rawCompareWith")
    public void setRawCompareWith(String rawCompareWith) {
        this.rawCompareWith = rawCompareWith;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("routerGuid")
    public String getRouterGuid() {
        return routerGuid;
    }

    @JsonProperty("routerGuid")
    public void setRouterGuid(String routerGuid) {
        this.routerGuid = routerGuid;
    }

    @JsonProperty("messages")
    public List<Object> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    @JsonProperty("facet")
    public String getFacet() {
        return facet;
    }

    @JsonProperty("facet")
    public void setFacet(String facet) {
        this.facet = facet;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @JsonProperty("contents")
    public com.webischia.jackson.Contents getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(com.webischia.jackson.Contents contents) {
        this.contents = contents;
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
