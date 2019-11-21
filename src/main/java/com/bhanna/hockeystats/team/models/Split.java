
package com.bhanna.hockeystats.team.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat",
    "team"
})
public class Split {

    @JsonProperty("stat")
    private Stat stat;
    @JsonProperty("team")
    private Team_ team;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stat")
    public Stat getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(Stat stat) {
        this.stat = stat;
    }

    @JsonProperty("team")
    public Team_ getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team_ team) {
        this.team = team;
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
