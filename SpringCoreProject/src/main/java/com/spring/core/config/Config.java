package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.core.config"})
public class Config {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("Rupali");
        return employee;
    }

    @Bean
    public Address address1(){
        Address address = new Address();
        address.setCity("Pune");
        address.setPinCode(411);
        return address;
    }

    @Bean
    public Address address2(){
        Address address = new Address();
        address.setCity("Mumbai");
        address.setPinCode(400);
        return address;
    }
}
