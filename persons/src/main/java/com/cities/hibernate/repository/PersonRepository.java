package com.cities.hibernate.repository;


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
    public List<String> getPersonsByCity(String name) {

        Query query = manager.createQuery("SELECT  ord.productName FROM Order as ord JOIN Customer as cst on cst.id = ord.customer.id  WHERE cst.name = :name");
        query.setParameter("name", name);
        List<String> resultList = query.getResultList();

        return resultList;
    }


}
