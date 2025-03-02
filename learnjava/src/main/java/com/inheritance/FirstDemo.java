package com.inheritance;

class Parent {
    int x;
    int y;
    int addition(){
        return x+y;
    }
    int subtraction(){
        return x-y;
    }
}
class Child extends Parent{
    int multiplication(){
        return x*y;
    }
    int division(){
        return x/y;
    }
}

public class FirstDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.x = 10;
        obj.y = 5;
        System.out.println("Addition is "+obj.addition());
        System.out.println("Subtraction is "+obj.subtraction());
        System.out.println("Multiplication is "+obj.multiplication());
        System.out.println("Division is "+obj.division());
    }
}
