package com.access;

class Variable {
    int x = 8;
    static int y = 10;
    void calculate(){
        x = x+5;
        y++;
        System.out.println("X value is "+x+" and Y value is "+y);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Variable var1 = new Variable();
        var1.calculate();
        //var1.calculate();

        Variable var2 = new Variable();
        var2.calculate();
        //var2.calculate();

        Variable var3 = new Variable();
        var3.calculate();
        //var3.calculate();

        var1.calculate();

    }
}
