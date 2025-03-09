package com.exception;

class Demo {
    public void divide(int dividend, int divisor) throws NullPointerException{
        if(divisor == 0) {
            throw new NullPointerException("Divisor cannot be zero.");
        }
        int quotient = dividend / divisor;
        System.out.println("Quotient is: "+quotient);
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        System.out.println("Begin the program..");
        Demo demo = new Demo();
        try{
            demo.divide(12, 0);
        } catch(NullPointerException ae){
            System.err.println("Exception occured: "+ae.getMessage());
        }
        System.out.println("End the program..");
    }
}
