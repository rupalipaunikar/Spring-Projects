package com.aop.service;

import com.aop.model.Circle;
import com.aop.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;


    public Circle getCircle() {
        System.out.println("get Circle called");
        return circle;
    }
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
