package com.interfaces;

interface IVehicle {
    void drive();
    void turnLeft();
    void brake();
}

interface IPUblicTransport {
    void getNumberOfPeople();
}

class MotrizedVehicle {
    void checkMotror(){
        System.out.println("the motor of the vehicle is ok");
    }
}

class Car extends MotrizedVehicle implements IVehicle {
    public void drive(){
        System.out.println("The car is driving");
    }
    public void turnLeft(){
        System.out.println("The car is turning left");
    }
    public void brake(){
        System.out.println("The car is braking");
    }
}

class Train implements IVehicle, IPUblicTransport {
    public void drive(){
        System.out.println("The train is driving");
    }
    public void turnLeft(){
        System.out.println("The train is turning left");
    }
    public void brake(){
        System.out.println("The train is braking");
    }
    public void getNumberOfPeople(){
        System.out.println("The train has 100 people");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        IVehicle iVehicle = new Car();
        iVehicle.drive();
        iVehicle.turnLeft();
        iVehicle.brake();
        new Car().checkMotror();

        iVehicle = new Train();
        iVehicle.drive();
        iVehicle.turnLeft();
        iVehicle.brake();
        IPUblicTransport iPublicTransport = new Train();
        iPublicTransport.getNumberOfPeople();
    }
}
