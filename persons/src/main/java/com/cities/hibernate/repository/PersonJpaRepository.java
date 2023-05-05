package com.cities.hibernate.repository;

import com.cities.hibernate.entity.Person;
import com.cities.hibernate.entity.PersonId;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, PersonId> {
        public List<Person> findByCity(String city);
        public Optional<Person> findByNameAndSurname(String name, String surname);
        public List<Person> findByAgeLessThan(int age, Sort sort);
}
