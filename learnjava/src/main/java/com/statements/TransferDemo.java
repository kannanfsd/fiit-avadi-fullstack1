package com.statements;

class Welcome{
    void printMessage(){
        System.out.println("Print all..");
    }
}

public class TransferDemo {
    public static void main(String[] args) {
        int count = 5;
        Welcome welcome = new Welcome();
        for(int i=1;i<=count;i++){
            if(i==3){
                return;
            }
            welcome.printMessage();
        }
        System.out.println("Done..");
    }
}
