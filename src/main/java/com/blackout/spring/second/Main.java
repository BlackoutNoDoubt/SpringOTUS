package com.blackout.spring.second;
import com.blackout.spring.second.service.GeneralService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
//        QuestionService service = context.getBean(QuestionService.class);
//        System.out.println(service.getAllQuestions());
//        System.out.println();
//        System.out.println(service.getQuestion());
//        System.out.println(service.getQuestion());
//        System.out.println(service.getQuestion());

        GeneralService service = context.getBean(GeneralService.class);
        service.start();

//        AnswerService service = context.getBean(AnswerService.class);
//        System.out.println(service.writeAnswer());
        context.close();
    }
}
