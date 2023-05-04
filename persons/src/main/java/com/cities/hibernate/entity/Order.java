package com.cities.hibernate.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "date")
    private Date date;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "amount")
    private Integer amount;
    @ManyToOne
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
