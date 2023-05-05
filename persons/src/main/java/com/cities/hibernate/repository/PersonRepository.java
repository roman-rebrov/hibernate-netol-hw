package com.cities.hibernate.repository;


import com.cities.hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {



    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public List<Person> getPersonsByCity(String city){

        Query query = manager.createQuery( "SELECT  p FROM Person p WHERE p.cityOfLiving = :city");
        query.setParameter("city", city);
        List<Person> resultList = query.getResultList();

        return resultList;
    }



}
