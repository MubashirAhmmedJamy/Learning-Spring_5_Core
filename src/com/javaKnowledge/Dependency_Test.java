package com.javaKnowledge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dependency_Test {

    public static void main(String[] args) {
        
        System.out.println("Creating ApplicationContext - c1\n");
        ApplicationContext con = new ClassPathXmlApplicationContext("/com/javaKnowledge/applicationContext.xml");
        
        System.out.println("Employee object creating - ob1\n");
        Employee one = (Employee) con.getBean("e");
        
        System.out.println("Calling employees show method\n");
        one.show();
        
        
//        System.out.println("Autowire object creating from normal Application Context- ob10");
//        Auto a = (Auto) con.getBean("auto");
//        System.out.println("Autowire show calling");
//        a.show();
        
        
        System.out.println("Setter object creating - ob2\n");
        Setter s = (Setter) con.getBean("set");
        System.out.println("Setter show calling\n");
        s.show();
        
        System.out.println("Bean definition object creating - ob3\n");
        BeanDefinitionInheritance bd = (BeanDefinitionInheritance) con.getBean("BD2");
        System.out.println("Bean definition show calling\n");
        bd.show();
        
        System.out.println("BeanScope object creating - ob4\n");
        BeanScope bs = (BeanScope) con.getBean("BS1");
        System.out.println("BeanScopeSetter method calling\n");
        bs.setS("String one BS1");
        
        System.out.println("BeanScope show calling\n");
        bs.show();
        
        System.out.println("Another BeanScope Object creating - ob5\n");
        BeanScope cs = (BeanScope) con.getBean("BS1");
        System.out.println("Another BeanScope show method calling\n");
        cs.show();
        
        System.out.println("BeanScope object creating - Prototype - ob6\n");
        BeanScope bs2 = (BeanScope) con.getBean("BS2");
        System.out.println("BeanScope setter method calling - Prototype\n");
        bs2.setS("String one BS2");
        
        System.out.println("BeanScope show method calling\n");
        bs2.show();
        
        System.out.println("Another BeanScope object creating - Prototype - ob7\n");
        BeanScope cs2 = (BeanScope) con.getBean("BS2");
        System.out.println("Another BeanScope show method calling - Prototype\n");
        cs2.show(); //now this is going to be a null string
        
        
        System.out.println("Abstract Application Context creating - ac2\n");
        AbstractApplicationContext cont = new ClassPathXmlApplicationContext("/com/javaKnowledge/applicationContext.xml");
        System.out.println("Abstract Application Context - RegisterShutdownhook Calling\n");
        cont.registerShutdownHook();
        
        
        System.out.println("Hello object creating - ob-h1-8\n");
        Hello hel = (Hello) cont.getBean("hello");
        System.out.println("Hello setMessage calling\n");
        hel.setMessage("This has been set to hello");
        
        System.out.println("Hello show calling\n");
        System.out.println(hel.getMessage());        
        
        System.out.println("Creating another application Context - c3");
        ApplicationContext c = new ClassPathXmlApplicationContext("/com/javaKnowledge/applicationContext.xml");
        System.out.println("RequiredAnnotation object creating - ob9");
        RequiredAnnotation ra = (RequiredAnnotation) c.getBean("RA");
        System.out.println("RequiredAnnotation show calling");
        ra.show();
        
        System.out.println("Autowire object creating from Abstract Application Context- ob10");
        Auto a = (Auto) c.getBean("auto");
        System.out.println("Autowire show calling");
        a.show();
        
        System.out.println("ComStereo object creating - ob10");
        ComStereo cst = (ComStereo) c.getBean("comstereo");
        System.out.println("ComStereo show calling");
        cst.show();
    }
}