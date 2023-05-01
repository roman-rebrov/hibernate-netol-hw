package com.cities.hibernate.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "persons")
public class Persons {


    @Id
    @Column
    private String name;
    @Id
    @Column
    private String surname;
    @Id
    @Column
    private Integer age;
    @Column
    private String phone_number;
    @Column
    private String city_of_living;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity_of_living() {
        return city_of_living;
    }

    public void setCity_of_living(String city_of_living) {
        this.city_of_living = city_of_living;
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
