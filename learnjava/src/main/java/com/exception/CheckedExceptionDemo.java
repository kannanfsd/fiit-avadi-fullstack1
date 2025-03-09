package com.exception;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Begin the program..");
        for(int i=0;i<10;i++){
            System.out.println("Welcome to All Java upcoming    Programmers..");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.err.println("Exception occured: "+e.getMessage());
            }
        }
        System.out.println("End the program..");
    }
}
