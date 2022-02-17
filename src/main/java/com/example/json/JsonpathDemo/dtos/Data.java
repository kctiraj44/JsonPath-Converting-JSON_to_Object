
package com.example.json.JsonpathDemo.dtos;

import java.util.HashMap;
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
    "Capital",
    "mintemp",
    "maxtemp",
    "currency"
})
@Generated("jsonschema2pojo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Data {

    @JsonProperty("Capital")
    public String capital;
    @JsonProperty("mintemp")
    public Integer mintemp;
    @JsonProperty("maxtemp")
    public Integer maxtemp;
    @JsonProperty("currency")
    public String currency;

}
