package com.cities.hibernate.repository;

import com.cities.hibernate.entity.Persons;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJpaRepository extends JpaRepository<Persons, String> {
        public List<Persons> findByCity(String city);
        public Optional<Persons> findByNameAndSurname(String name, String surname);
        public List<Persons> findByAgeLessThan(int age, Sort sort);
}
