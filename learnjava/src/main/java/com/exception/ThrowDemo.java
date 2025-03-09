package com.exception;

import java.io.IOException;

class Test1 {
    void m1() throws IOException {
        throw new IOException("Hello this m1 Exception - Raised by FIIT Java batch");
    }
}
class Test2 {
    void m2() throws IOException        {
        Test1 test1 = new Test1();
        test1.m1();
        System.out.println("This is m2 method.");
    }
}
class Test3 {
    void m3()throws IOException {
        Test2 test2 = new Test2();
        test2.m2();
        System.out.println("This is m3 method.");
    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("Begin the program");
        Test3 obj = new Test3();
        try {
            obj.m3();
        } catch (IOException e) {
            System.err.println("Exception occured: " + e.getMessage());
        }
        System.out.println("End the program");
    }
}
