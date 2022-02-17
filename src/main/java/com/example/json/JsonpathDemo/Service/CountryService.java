package com.example.json.JsonpathDemo.Service;

import com.example.json.JsonpathDemo.Invoker.JsonInvoker;
import com.example.json.JsonpathDemo.dtos.CountryResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private JsonInvoker jsonInvokerr;

    ObjectMapper mapper = new ObjectMapper();

    public Object fetchAll(String jsonExpressions, Class<?> classType ) throws JsonProcessingException {
         CountryResponse response = jsonInvokerr.getInfo();
        System.out.println("*----Response :"+response);
          String jsonFile = mapper.writeValueAsString(response);
        System.out.println("*----JSon :"+jsonFile);
        Object countryResponse = JsonPath.parse(jsonFile).read(jsonExpressions,classType);
        System.out.println("*----Response :"+countryResponse);
        return countryResponse;

    }


}
