package com.statements;

public class BlockDemo {
    static int id;
    static String name;
    {
        id = 1202;
        name = "Jenifer";
    }
    static void display() {
        System.out.println("ID: "+id+" Name: "+name);
    }

    public static void main(String[] args) {
       BlockDemo blockDemo = new BlockDemo();
       display();
    }
}
