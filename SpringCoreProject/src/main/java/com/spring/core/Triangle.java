package com.spring.core;

public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        System.out.println("Drawing triangle...");
        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC);
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}