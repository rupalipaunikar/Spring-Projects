package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object obj, String arg1) throws BeansException {
        Circle circle = null;
        if(obj instanceof Circle){
            circle = (Circle) obj;
            System.out.println("BeanPostProcessor postProcessAfterInitialization: " + circle.getId());
        }
        return obj;
    }

    public Object postProcessBeforeInitialization(Object obj, String arg1) throws BeansException {
        Circle circle = null;
        if(obj instanceof Circle){
            circle = (Circle) obj;
            circle.setId(1);
            System.out.println("BeanPostProcessor postProcessBeforeInitialization" + circle.getId());
        }

        return obj;
    }

}