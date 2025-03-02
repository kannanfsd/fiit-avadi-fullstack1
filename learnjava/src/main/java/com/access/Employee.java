package com.access;

public class Employee {
    //private String firstName = "Ramesh";
    //private String lastName = "Suresh";
    //private String location = "Hyderabad";

    Employee() {
        this("John", "Doe");
        System.out.println("This is Default Constructor");
        System.out.println("FIIT-Avadi-WeekEnd Java Batch - Day7");
    }

    Employee(String firstName, String lastName) {
        this("Ram", "Seetha", "Chennai");
        System.out.println("This is Parameterized Constructor[2 string args]");
        System.out.println("First Name: "+firstName+" Last Name: "+lastName);
    }

    Employee(String firstName, String lastName, String location) {
        System.out.println("This is Parameterized Constructor[3 string args]");
        System.out.println("First Name: "+firstName+" Last Name: "+lastName+" Location: "+location);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        //Employee employee2 = new Employee("Ramesh", "Suresh");
        //Employee employee3 = new Employee("Raman" ,"Laxman", "Ayothiya");
    }
}
