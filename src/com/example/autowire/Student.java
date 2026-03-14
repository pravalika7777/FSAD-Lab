package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    Certification certification;

    public void display(){
        System.out.println("Student object created");
        certification.show();
    }
}
