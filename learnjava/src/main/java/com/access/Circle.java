package com.access;

public class Circle {
    double calculateArea(double radius) {
        double aoc = Math.PI * radius * radius;
        return aoc;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double areaOfCircle = circle.calculateArea(12.5);
        System.out.println("Area of Circle is: " + areaOfCircle);
    }
}
