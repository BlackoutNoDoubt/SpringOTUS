package com.blackout.spring.second;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuestionService service = context.getBean(QuestionService.class);
        System.out.println(service.getAllQuestions());
        System.out.println();
        System.out.println(service.getQuestion());
        System.out.println(service.getQuestion());
        System.out.println(service.getQuestion());
        context.close();
    }
}
