package com.javaKnowledge;
public class BeanScope {
    Address a;
    String s;

    public void setS(String s) {
        this.s = s;
    }
    
    

    public void setA(Address a) {
        this.a = a;
    }
    
    public void show(){
        System.out.println("Bean Scope Working:");
        System.out.println(s);
    }
}
