package com.cities.hibernate.repository;


import com.cities.hibernate.entity.Person;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
public class PersonRepository {


    @Autowired
    private PersonJpaRepository jpaRepository;
    private Logger log = Logger.getLogger(PersonRepository.class.getName());

    @Transactional
    public List<Person> getPersonsByCity(String city){

        List<Person> resultList = jpaRepository.findByCity(city);

        return resultList;
    }

    @Transactional
    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {

        Optional<Person> resultList = jpaRepository.findByNameAndSurname(name, surname);

        return resultList;
    }

    @Transactional
    public List<Person> getPersonsByAge(int age) {

        List<Person> resultList = jpaRepository.findByAgeLessThan(age, Sort.by("age"));

        return resultList;
    }
}
