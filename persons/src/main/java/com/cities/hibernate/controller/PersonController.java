package com.cities.hibernate.controller;


import com.cities.hibernate.entity.Persons;
import com.cities.hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/by-city")
    public ResponseEntity<List<Persons>> getPersonsByCity(@RequestParam("city") String city){
        final List<Persons> response = service.getPersonsByCity(city);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/by-name")
    public ResponseEntity<Persons> getPersonsByCity(@RequestParam("name") String name, @RequestParam("surname") String surname){
        final Optional<Persons> response = service.getPersonsByNameAndSurname(name, surname);

        if (response.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response.get());
    }

    @GetMapping("/by-age")
    public ResponseEntity<List<Persons>> getPersonsByAge(@RequestParam("age") int age){
        final List<Persons> response = service.getPersonsByAge(age);

        return ResponseEntity.ok(response);
    }
}
