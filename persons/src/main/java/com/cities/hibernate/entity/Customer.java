package com.cities.hibernate.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
