package com.cities.hibernate.service;

import com.cities.hibernate.entity.Persons;
import com.cities.hibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Persons> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
