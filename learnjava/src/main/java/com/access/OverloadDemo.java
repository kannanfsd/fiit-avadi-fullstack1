package com.access;

class Overload {
    static void test(){
        System.out.println("Default Test method.");
    }
    void test(int a){
        System.out.println("One Argument(int) Test method."+a);
    }
    void test(String name){
        System.out.println("One Argument(String) Test method."+name);
    }
    void test(int a,String name){
        System.out.println("Two Argument(int,String) Test method."+a+" "+name);
    }
    void test(String name,int a){
        System.out.println("Two Argument(String,int) Test method."+name+" "+a);
    }

}


public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        Overload.test();
        overload.test(10);
        overload.test("Java");
        overload.test(10,"Java");
        overload.test("Java",10);
    }
}
