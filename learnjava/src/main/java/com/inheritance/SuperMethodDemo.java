package com.inheritance;

class ParentA{
    ParentA() {
        System.out.println("ParentA default constructor.");
    }
    ParentA(String name, String location){
        System.out.println("ParentA: Person Name: "+name+" Location: "+location);
    }
}
class ChildA extends ParentA{
    ChildA() {
        super("Ramesh", "Chennai");
        System.out.println("ChildA default constructor.");
    }
    ChildA(String name, String location){
        //super(name, location);
        System.out.println("ChildA: Person Name: "+name+" Location: "+location);
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        ChildA obj1 = new ChildA();

    }
}
