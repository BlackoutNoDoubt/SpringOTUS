package com.blackout.spring.second;
import com.blackout.spring.second.service.GeneralService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        GeneralService service = context.getBean(GeneralService.class);
        service.start();

        context.close();
    }
}
