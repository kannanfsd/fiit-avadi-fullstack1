package com.inheritance;

class Super {
    void display() {
        System.out.println("This is super class display method.");
    }
}
class Sub extends  Super {
    @Override
    void display() {
        super.display();
        System.out.println("This is sub class display method.");
    }
}
public class SuperKeyDemo {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.display();
    }
}
