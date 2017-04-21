package com.aop.model;

import com.aop.aspect.Loggable;

public class Circle {

    private String name;

    @Loggable
    public String getName() {
        System.out.println("Circle getter called");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle's setter has been called");
        throw new RuntimeException( "exception...");
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("Circle's setter has been called");
        return name;
    }


}
