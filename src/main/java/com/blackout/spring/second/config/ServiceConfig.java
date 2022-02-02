package com.blackout.spring.second.config;

import com.blackout.spring.second.dao.AnswerDAO;
import com.blackout.spring.second.dao.QuestionDAO;
import com.blackout.spring.second.service.AnswerService;
import com.blackout.spring.second.service.GeneralService;
import com.blackout.spring.second.service.QuestionService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Bean
    public QuestionService questionService(QuestionDAO questionDAO) {
        return new QuestionService(questionDAO);
    }

    @Bean
    public AnswerService answerService(AnswerDAO answerDAO) {
        return new AnswerService(answerDAO);
    }

    @Bean
    public GeneralService generalService(QuestionService questionService, AnswerService answerService) {
        return new GeneralService(questionService, answerService);
    }
}
