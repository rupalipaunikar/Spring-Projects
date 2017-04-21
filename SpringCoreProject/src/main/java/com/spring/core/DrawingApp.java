package com.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
//        Shape shape1 = (Shape)  context.getBean("triangle3");
//        Shape shape2 = (Shape)  context.getBean("line");
        Shape shape3 = (Shape)  context.getBean("circle");

//        System.out.println("\n1st CALL TO DRAW METHOD.....");
//        shape1.draw();
//        System.out.println("\n2nd CALL TO DRAW METHOD.....");
//        shape2.draw();
        System.out.println("\n3rd CALL TO DRAW METHOD.....");
        shape3.draw();
    }
}
