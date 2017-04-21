package com.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee{

    private String name;
    @Autowired
    private Address address1;
    @Autowired
    private Address address2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address1=" + address1 +
                ", address2=" + address2 +
                '}';
    }
}