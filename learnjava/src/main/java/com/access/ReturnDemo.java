package com.access;

public class ReturnDemo {
    public String getNumberInWords(int number) {
        String result = "Unknown";
        if(number == 1) {
            result = "one";
        } else if(number == 2) {
            result = "two";
        } else if(number == 3) {
            result = "three";
        }
        return result;
    }

    public static void main(String[] args) {
        ReturnDemo returnDemo = new ReturnDemo();
        System.out.println(returnDemo.getNumberInWords(1));
        System.out.println(returnDemo.getNumberInWords(2));
        System.out.println(returnDemo.getNumberInWords(3));
        System.out.println(returnDemo.getNumberInWords(4));
    }
}
