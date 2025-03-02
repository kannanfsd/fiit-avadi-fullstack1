package com.interfaces;

interface ISample {
    long count = 1020L;
    void printMessage();
    default void printDefaultMessage() {
        System.out.println("Default message..");
    }
    static void printStaticMessage() {
        System.out.println("Static message..");
    }
}

class Sample implements ISample {
    public void printMessage() {
        System.out.println("Message.."+count);
    }
}

public class SecondInterfaceDemo {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.printMessage();
        sample.printDefaultMessage();
        ISample.printStaticMessage();
    }
}
