/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaKnowledge;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Jamy
 */

//
public class Hello implements InitializingBean, DisposableBean{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    @PostConstruct
    public void init(){
        System.out.println("Initializing hello class -Annotation | "+ message);
    }
    
    @PreDestroy
    public void clear(){
        System.out.println("Destroying hello class -Annotation | "+ message);
    }
    
    
    
    public void initA(){
        System.out.println("Initializing hello class -Method | "+ message);
    }
    

    public void clearA(){
        System.out.println("Destroying hello class -Method | "+ message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing hello class - Interface | "+ message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying hello class - Interface | "+ message);
    }
    
}
