package com.exception;

import java.util.Scanner;

class Register{
    public static boolean validateAge(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age should be greater than 18.");
        }
        return true;
    }
    public static  boolean validateCountry(String country) throws InvalidCountryException{
        if(!country.equalsIgnoreCase("India")){
            throw new InvalidCountryException("Country should be India.");
        }
        return true;
    }
}


public class RegistrationProfile {
    public static void main(String[] args) {
        System.out.println("Begin the program...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your country: ");
        String country = scan.next();
        try {
            boolean result1 = Register.validateAge(age);
            boolean result2 = Register.validateCountry(country);
            if (result1 && result2) {
                System.out.println("You are eligible for registration.");
            }
        } catch (InvalidAgeException | InvalidCountryException e) {
            System.err.println("Exception occured: " + e.getMessage());
        }
        scan.close();
        System.out.println("End the program...");
    }
}
