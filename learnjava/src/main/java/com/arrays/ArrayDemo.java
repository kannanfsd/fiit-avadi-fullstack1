package com.arrays;

public class ArrayDemo {
    int[] numbers;
    void storeNumbers() {
        numbers = new int[101];
        for(int i=0;i<=100;i++) {
            numbers[i]=i;
        }
    }
    void printNumbers() {
        System.out.println("The odd number between 0 to 100 are: ");
        for(int i=0;i<=100;i++) {
            if(numbers[i]%2!=0) {
                System.out.print(numbers[i]+"  ");
            }
        }
    }
    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        demo.storeNumbers();
        demo.printNumbers();
    }
}
