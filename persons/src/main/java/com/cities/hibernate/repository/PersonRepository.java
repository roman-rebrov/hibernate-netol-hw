package com.cities.hibernate.repository;


import com.cities.hibernate.entity.Persons;
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
    public List<Persons> getPersonsByCity(String city){

        List<Persons> resultList = jpaRepository.findByCity(city);

        return resultList;
    }

    @Transactional
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {

        Optional<Persons> resultList = jpaRepository.findByNameAndSurname(name, surname);

        return resultList;
    }

    @Transactional
    public List<Persons> getPersonsByAge(int age) {

        List<Persons> resultList = jpaRepository.findByAgeLessThan(age, Sort.by("age"));

        return resultList;
    }
}
