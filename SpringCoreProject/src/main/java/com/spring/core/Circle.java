package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape, ApplicationContextAware, BeanNameAware, BeanClassLoaderAware,
        BeanFactoryAware, InitializingBean, DisposableBean {

    @Autowired
    @Qualifier("pointA")
    private Point pCenter;
    private ApplicationContext appContext;
    private ClassLoader classLoader;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void draw() {
        System.out.println("Drawing circle...with id "+id);
        System.out.println(pCenter);
    }

    public void setBeanName(String beanName) {
        System.out.println("BeanNameAware Bean name is: " + beanName+id);

    }

    public void destroy() throws Exception {
        System.out.println("Disposable beans destroy called"+id);

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing beans afterPropertiesSet method called"+id);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appContext = applicationContext;
        System.out.println("ApplicationContextAware"+id);

    }


    public void initMethod() {
        System.out.println("My init method called"+id);
    }


    public void destroyMethod() {
        System.out.println("My finish method called "+id);
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
        System.out.println("BeanClassLoaderAware"+id);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware"+id);
    }
}
