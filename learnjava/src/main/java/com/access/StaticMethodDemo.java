package com.access;

class Methods {
    static int x = 8;
    static int y = 10;
    void display1() {
        //non-static method
        System.out.println("Other class Non-static-Display 1");
        System.out.println("x value is "+x+" and y value is "+y);
    }
    static void display2() {
        //static method
        System.out.println("Other class Static-Display 2");
        System.out.println("x value is "+x+" and y value is "+y);
    }
}


public class StaticMethodDemo {
    void display1() {
        //non-static method
        System.out.println("Same class Non-static-Display 1");
    }
    static void display2() {
        //static method
        System.out.println("Same class Static-Display 2");
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.display1();
        methods.display2();
    }
}
