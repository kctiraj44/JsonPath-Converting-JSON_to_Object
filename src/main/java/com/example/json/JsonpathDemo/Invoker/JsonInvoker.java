package com.example.json.JsonpathDemo.Invoker;

import com.example.json.JsonpathDemo.dtos.Country;
import com.example.json.JsonpathDemo.dtos.CountryResponse;
import com.example.json.JsonpathDemo.dtos.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JsonInvoker {


    public CountryResponse getInfo(){
        CountryResponse countryResponse = new CountryResponse();
        countryResponse.setDescription("This is just the demo app");
        countryResponse.setRegion("Asia");

        List<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCountry("USA");
        Data data = new Data();
        data.setCapital("DC");

        Country country1 = new Country();
        country1.setCountry("Canada");
        Data data1 = new Data();
        data1.setCapital("Toronto");
        countries.add(country);
        countries.add(country1);
        countryResponse.setCountries(countries);
        return  countryResponse;

     }
}
