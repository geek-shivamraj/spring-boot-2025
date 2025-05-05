package com.geek.spring.concept1.metadata.configuration.annotation.based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);

        context = new AnnotationConfigApplicationContext(AppConfig1.class);
        student = context.getBean(Student.class);
        System.out.println(student);

        // Same bean definition will be Overridden
        context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig1.class);
        student = context.getBean(Student.class);
        System.out.println(student);
    }
}
