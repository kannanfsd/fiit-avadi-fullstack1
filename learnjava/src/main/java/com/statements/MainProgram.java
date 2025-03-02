package com.statements;


import javax.swing.*;
import java.util.Scanner;

class NumberCheck {
    static int result;
    static int displayBigNumber1(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            result = num1;
        } else if(num2>num1 && num2>num3){
            result = num2;
        } else {
            result = num3;
        }
        return result;
    }
    static int displayBigNumber2(int num1, int num2, int num3){
        if(num1>num2) {
            if(num1>num3){
                result = num1;
            } else {
                result = num3;
            }
        } else {
            if(num2>num3){
                result = num2;
            } else {
                result = num3;
            }
        }
        return result;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num1 value: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the num2 value: ");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter the num3 value: ");
        int num3 = Integer.parseInt(scan.nextLine());

        int response1 = NumberCheck.displayBigNumber1(num1, num2, num3);
        System.out.println(response1+" is biggest one.");
        int response2 = NumberCheck.displayBigNumber2(num1, num2, num3);
        System.out.println(response2+" is biggest one.");
        scan.close();
    }
}
