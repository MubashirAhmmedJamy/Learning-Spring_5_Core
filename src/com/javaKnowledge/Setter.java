/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaKnowledge;

import java.util.List;

/**
 *
 * @author Jamy
 */
public class Setter {
    String s;
    List <Address> get;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    } 

    public List<Address> getGet() {
        return get;
    }

    public void setGet(List<Address> get) {
        this.get = get;
    }
    
    
    public void show(){
        System.out.println("Setter class working");
        System.out.println(s);
        System.out.println(get);
    }
    
}
