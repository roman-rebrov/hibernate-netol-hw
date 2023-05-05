package com.cities.hibernate.entity;


import jakarta.persistence.*;


@Entity
@IdClass(PersonId.class)
@Table(name = "persons")
public class Person {


    @Id
    @Column
    private String name;
    @Id
    @Column
    private String surname;
    @Id
    @Column
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
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
