package com.javaKnowledge;

import java.util.List;

public class BeanDefinitionInheritance {
    Address a1;
    Address a2;
    List<Address> a3;
    
    public void show(){
        System.out.println("Bean Definition working");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

    public Address getA1() {
        return a1;
    }

    public void setA1(Address a1) {
        this.a1 = a1;
    }

    public Address getA2() {
        return a2;
    }

    public void setA2(Address a2) {
        this.a2 = a2;
    }

    public List<Address> getA3() {
        return a3;
    }

    public void setA3(List<Address> a3) {
        this.a3 = a3;
    }
    
    
}
