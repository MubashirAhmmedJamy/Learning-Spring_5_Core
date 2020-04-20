package com.javaKnowledge;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component(value = "comstereo")
public class ComStereo {

    Address a1;

    public Address getA1() {
        return a1;
    }

    @Resource(name = "a1")
    @Required
    public void setA1(Address a1) {
        this.a1 = a1;
    }

    public void show() {
        System.out.println("ComStereo show: " + a1.toString());
    }
}
