package com.cities.hibernate.service;

import com.cities.hibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<String> getPersonsByCity(String name) {
        return repository.getPersonsByCity(name);
    }
}
