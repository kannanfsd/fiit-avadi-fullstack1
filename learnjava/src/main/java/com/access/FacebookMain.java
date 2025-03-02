package com.access;

public class FacebookMain {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();

        System.out.println("Age: "+facebook.getAge());
        System.out.println("Phone Number: "+facebook.getPhoneNumber());
        System.out.println("Marital Status: "+facebook.getMaritalStatus());

        facebook.setAge(21);
        facebook.setPhoneNumber(45896741L);
        facebook.setMaritalStatus("Single");

        System.out.println("Age: "+facebook.getAge());
        System.out.println("Phone Number: "+facebook.getPhoneNumber());
        System.out.println("Marital Status: "+facebook.getMaritalStatus());
    }
}
