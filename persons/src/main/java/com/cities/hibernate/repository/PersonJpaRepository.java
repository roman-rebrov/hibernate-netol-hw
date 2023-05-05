package com.cities.hibernate.repository;

import com.cities.hibernate.entity.Person;
import com.cities.hibernate.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, PersonId> {
        @Query("select p from Person as p where p.city = :city")
        public List<Person> findByCity(String city);
        @Query("select p from Person as p where p.name = :name and p.surname = :surname")
        public Optional<Person> findByNameAndSurname(String name, String surname);
        @Query("select p from Person as p where p.age < :age order by p.age")
        public List<Person> findByAgeLessThan(int age);
}
