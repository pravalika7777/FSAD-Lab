package com.example.autowire;

import org.springframework.stereotype.Component;

@Component
public class Certification {
    private int id = 101;
    private String name = "Spring";

    public void show(){
        System.out.println("Certification: "+name);
    }
}
