package com.cities.hibernate.entity;


import jakarta.persistence.*;


@Entity
@IdClass(PersonId.class)
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "name")
    private String name;
    @Id()
    @Column(name = "surname")
    private String surname;
    @Id
    @Column(name = "age")
    private Integer age;
    @Column(name = "phone_number")
    private String phone;
    @Column(name = "city_of_living")
    private String city;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}