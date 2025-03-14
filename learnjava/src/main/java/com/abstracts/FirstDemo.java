package com.abstracts;

abstract class LivingThing{
    public abstract void walk();
}
class Human extends LivingThing{
    public void walk(){
        System.out.println("Human, walk with two legs.");
    }
}
class Cow extends LivingThing{
    public void walk(){
        System.out.println("Cow, walk with four legs.");
    }
}
public class FirstDemo {
    public static void main(String[] args) {
        LivingThing obj = new Human();
        obj.walk();
        obj = new Cow();
        obj.walk();
    }
}
