package com.example.Gita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gita.service.MyService;

@RestController
@RequestMapping("/gita")
public class MyController {
	
	@Autowired
	private MyService myService;
	
	
	@GetMapping("/fetch-data")
    public String fetchData() {
        return myService.fetchDataFromApi();
    }
	
	
}
