package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class FactoryService {

    public Object getBean(String beanType) {

        if (beanType.equalsIgnoreCase("shapeService"))
            return new ShapeServiceProxy();

        if (beanType.equalsIgnoreCase("circle"))
            return new Circle();

        if (beanType.equalsIgnoreCase("triangle"))
            return new Triangle();

        return null;
    }
}