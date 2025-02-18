package com.example.main;

import com.example.models.Person;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("");
        p.name = "Om";
        System.out.println(p.display());
    }
}
