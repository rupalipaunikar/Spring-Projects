package com.spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {

    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println("Employee - "+ employee);
    }
}
