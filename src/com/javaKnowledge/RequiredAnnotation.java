package com.javaKnowledge;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotation {
    private Address a;

    public Address getA() {
        return a;
    }

    @Required
    public void setA(Address a) {
        this.a = a;
    }
    
    
    public void show() {
        System.out.println(a.toString());
    }
}
