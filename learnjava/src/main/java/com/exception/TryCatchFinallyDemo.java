package com.exception;

class TryCatch{
    public static void divide(int a, int b){
        int quotient = 0;
        try{
            quotient = a / b;
        } catch(ArithmeticException ae){
            System.err.println("Exception occured: "+ae.getMessage());
        } finally {
            System.out.println("The Quotient is: "+quotient);
        }
    }
}
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("Begin the program..");
        TryCatch.divide(12, 0);
        System.out.println("End the program..");
    }
}
