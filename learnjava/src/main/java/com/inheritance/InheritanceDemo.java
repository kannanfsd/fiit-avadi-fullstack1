package com.inheritance;

import java.util.Scanner;

class BankAccount{
    double balance = 0.0d;
    double depositAmount;
    double withdrawAmount;
    double interestRate;
    void deposit(double amount){
        this.depositAmount = amount;
        this.balance = this.balance + depositAmount;
        System.out.println("Balance after deposit: "+this.balance);
    }
    void withdraw(double amount){
        this.withdrawAmount = amount;
        if(this.balance<withdrawAmount){
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance = this.balance - withdrawAmount;
        System.out.println("Balance after withdraw: "+this.balance);
    }
    void fixedDeposit() {
        this.interestRate = 9.25;
        System.out.println("Normal customer Interest Rate: "+this.interestRate);
    }

}
class NRIAccount extends BankAccount{
    @Override
    void fixedDeposit() {
        this.interestRate = 6.75;
        System.out.println("The bank offer NRI customer Interest Rate: "+this.interestRate);
    }
}
class SeniorCitizen extends BankAccount{
    @Override
    void fixedDeposit() {
        this.interestRate = 11.75;
        System.out.println("The bank offer Sr.Citizen customer Interest Rate: "+this.interestRate);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the deposit amount: ");
        double depositAmount = scan.nextDouble();
        System.out.println("Please enter the withdraw amount: ");
        double withdrawAmount = scan.nextDouble();
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(depositAmount);
//        bankAccount.withdraw(withdrawAmount);
//        bankAccount.fixedDeposit();

//        NRIAccount nriAccount = new NRIAccount();
//        nriAccount.deposit(depositAmount);
//        nriAccount.withdraw(withdrawAmount);
//        nriAccount.fixedDeposit();

        SeniorCitizen seniorCitizen = new SeniorCitizen();
        seniorCitizen.deposit(depositAmount);
        seniorCitizen.withdraw(withdrawAmount);
        seniorCitizen.fixedDeposit();
        scan.close();
    }
}
