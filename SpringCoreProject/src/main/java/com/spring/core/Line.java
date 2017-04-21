package com.spring.core;

import java.util.List;
import java.util.Map;

public class Line implements Shape{
    private List<Point> points;
    private Map<String, String> propertiesMap;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(Map<String, String> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }

    public void draw() {
        System.out.println("Drawing line...");
        System.out.println(points);
        System.out.println("Printing propertiesMap:- "+propertiesMap);
        System.out.println("HashCode:- "+this.hashCode());
    }
}
