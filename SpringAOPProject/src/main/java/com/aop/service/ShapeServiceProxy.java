package com.aop.service;

import com.aop.aspect.MyAspect;
import com.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

    @Override
    public Circle getCircle() {
        new MyAspect().loggingAdvice();
        Circle circle =  super.getCircle();
        new MyAspect().loggingAdvice();
        return circle;
    }
}