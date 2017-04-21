package com.aop;

import com.aop.service.FactoryService;
import com.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);

        //shapeService.getCircle().setNameAndReturn("my Circle");

        FactoryService factoryService = new FactoryService();
        ShapeService shapeService =(ShapeService)  factoryService.getBean("ShapeService");
        shapeService.getCircle();
        //System.out.println("CIRCLE NAME: " + shapeService.getCircle().getName());
        //System.out.println("TRIANGLE NAME: " + shapeService.getTriangle().getName());

    }

}