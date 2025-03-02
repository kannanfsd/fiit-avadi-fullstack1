package com.inheritance;

class Animal {
    public void whoAmI(){
        System.out.println("I am a Generic Animal.");
    }
}
class Dog extends Animal {
    public void whoAmI() {
        System.out.println("I am a Dog.");
    }
}
class Cow extends Animal {
    public void whoAmI() {
        System.out.println("I am a Cow.");
    }
}
class Snake extends Animal {
    public void whoAmI() {
        System.out.println("I am a Snake.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.whoAmI();
        animal = new Dog();
        animal.whoAmI();
        animal = new Cow();
        animal.whoAmI();
        animal = new Snake();
        animal.whoAmI();
    }
}
