package com.cities.hibernate.controller;


import com.cities.hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/by-orders")
    public ResponseEntity<List<String>> getPersonsByCity(@RequestParam("name") String name){
        final List<String> response = service.getPersonsByCity(name);
        return ResponseEntity.ok(response);
    }
}
