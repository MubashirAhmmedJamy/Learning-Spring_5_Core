package com.javaKnowledge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    
    @Bean
    public Hello has(){
        return new Hello();
    }
}
