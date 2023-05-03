package com.cities.hibernate.service;

import com.cities.hibernate.entity.Persons;
import com.cities.hibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Persons> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return repository.getPersonsByNameAndSurname(name, surname);
    }

    public List<Persons> getPersonsByAge(int age) {
        return repository.getPersonsByAge(age);
    }
}
