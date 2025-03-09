package com.exception;

import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Begin the program...");
        System.out.println("Please Enter the a value: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter the b value: ");
        int b = Integer.parseInt(scan.nextLine());
        try{
            int c = a / b;
            System.out.println(c);
        } catch(Exception e){
            System.err.println("Exception occured: "+e.getMessage());
        }
        scan.close();
        System.out.println("End the program...");
    }
}
