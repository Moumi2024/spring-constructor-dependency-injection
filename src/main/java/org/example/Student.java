package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Address address;

    @Autowired
    public Student(Address address) {   // constructor
        this.address = address;
    }

    public void show() {
        System.out.println(address.getCity());
    }
}