package com.cities.hibernate.repository;


import com.cities.hibernate.entity.Persons;
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
    public List<Persons> getPersonsByCity(String city){

        Query query = manager.createQuery( "SELECT  p FROM Persons p WHERE p.city_of_living = :city");
        query.setParameter("city", city);
        List<Persons> resultList = query.getResultList();

        return resultList;
    }



}
