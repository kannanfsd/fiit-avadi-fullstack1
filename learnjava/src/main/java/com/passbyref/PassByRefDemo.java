package com.passbyref;

class Test{
    int x;
    int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void alterPrimitive(int x, int y){
        x = 36;
        y = 45;
    }
    void alterObject(Test test){
        test.x = 64;
        test.y = 72;
    }
}

public class PassByRefDemo {
    public static void main(String[] args) {
        Test obj = new Test(12,25);
        System.out.println("Before change the values "+obj.x+" "+obj.y);
        obj.alterPrimitive(obj.x, obj.y);
        System.out.println("After change the values "+obj.x+" "+obj.y);
        obj.alterObject(obj);
        System.out.println("After change the object state "+obj.x+" "+obj.y);
    }
}
