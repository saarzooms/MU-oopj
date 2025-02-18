package com.example.models;

public class Student extends Person {
    Student(String aadhar) {
        super(aadhar);
    }

    void print() {
        System.out.println(this.asset);
        System.out.println(this.name);
        System.out.println(this.mobileNo);
    }

}
