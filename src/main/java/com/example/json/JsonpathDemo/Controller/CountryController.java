package com.example.json.JsonpathDemo.Controller;

import com.example.json.JsonpathDemo.Service.CountryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/getCoun")
    public List<String > gettheContry() throws JsonProcessingException {

        String expressions = "$.countries[*].Country";
        return
                (List<String>) service.fetchAll(expressions,List.class);

        

    }


}
