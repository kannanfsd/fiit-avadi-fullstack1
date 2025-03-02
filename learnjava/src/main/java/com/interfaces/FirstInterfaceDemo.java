package com.interfaces;

class Circle implements Shape{
    @Override
    public double calculateArea() {
        double radius = 25.2;
        double aoc = PI * radius * radius;
        return aoc;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}

class Square implements Shape {
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}


public class FirstInterfaceDemo {
    public static void main(String[] args) {
        Shape obj = new Circle();
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateVolume());
        obj = new Square();
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateVolume());
    }
}
