package com.geek.spring.concept1.metadata.configuration.annotation.based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() { return new Student(1, "Shivam"); }
}
