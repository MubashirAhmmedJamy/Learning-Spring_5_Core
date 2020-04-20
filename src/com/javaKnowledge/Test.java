package com.javaKnowledge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/javaKnowledge/applicationContext.xml");
        
        Hello h = (Hello)context.getBean("hello");
        
        h.setMessage("Hellow Spring");
        
        System.out.println(h.getMessage());
        
        ApplicationContext context2 = new AnnotationConfigApplicationContext(HelloConfig.class);
        
        h = (Hello)context2.getBean("has");
        
        h.setMessage("Hellow Spring 2");
        
        System.out.println(h.getMessage());
        
    }
}
