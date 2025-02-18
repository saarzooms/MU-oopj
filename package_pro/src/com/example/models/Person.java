package com.example.models;

public class Person {
    private String aadhar;
    protected double asset;
    public String name;
    String mobileNo;

    public Person(String aadhar) {
        this.aadhar = aadhar;
    }

    public String display() {
        return this.aadhar + "\n" + this.asset + "\n" + this.name + "\n" + this.mobileNo;
    }
}