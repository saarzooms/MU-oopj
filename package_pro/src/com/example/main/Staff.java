package com.example.main;

import com.example.models.Person;

public class Staff extends Person {
    Staff(String aadhar) {
        super(aadhar);
    }

    void show() {
        System.out.println(this.asset);
        System.out.println(this.name);
    }
}
