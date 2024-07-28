package com.example.Gita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {

    private static final String URL = "https://bhagavad-gita3.p.rapidapi.com/v2/chapters/?skip=0&limit=18";
    private static final String API_KEY = "c1fec71c7emsh5b1161db46e6b2dp1a5e10jsn9d44fae020e9";
    private static final String HOST_API = "bhagavad-gita3.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

//    public MyService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    public String fetchDataFromApi() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", API_KEY);
        headers.set("x-rapidapi-host", HOST_API);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(URL, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
