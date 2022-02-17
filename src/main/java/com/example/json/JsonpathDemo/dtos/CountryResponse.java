
package com.example.json.JsonpathDemo.dtos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Region",
    "countries"
})
@Generated("jsonschema2pojo")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CountryResponse {

    @JsonProperty("Description")
    public String description;
    @JsonProperty("Region")
    public String region;
    @JsonProperty("countries")
    public List<Country> countries = null;

}
