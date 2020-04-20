package com.javaKnowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Auto {
    Address a1;

    public Address getA1() {
        return a1;
    }

    @Autowired
    @Qualifier("QUA")
    @Required
    public void setA1(Address a1) {
        this.a1 = a1;
    }


    
    public void show(){
        System.out.println("Autowired show: " + a1.toString());
    }
}
