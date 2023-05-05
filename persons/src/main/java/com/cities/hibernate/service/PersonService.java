package com.cities.hibernate.service;

import com.cities.hibernate.entity.Person;
import com.cities.hibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
