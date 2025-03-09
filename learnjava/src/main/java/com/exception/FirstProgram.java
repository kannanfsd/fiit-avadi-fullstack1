package com.exception;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Begin the program...");
        System.out.println("Please Enter the a value: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter the b value: ");
        int b = Integer.parseInt(scan.nextLine());
        int c = a / b;
        System.out.println(c);
        scan.close();
        System.out.println("End the program...");
    }
}
