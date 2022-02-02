package com.blackout.spring.second.config;

import com.blackout.spring.second.dao.AnswerDAO;
import com.blackout.spring.second.dao.QuestionDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DaoConfig {

    @Bean
    public QuestionDAO questionDAO() {
        return new QuestionDAO();
    }

    @Bean
    public AnswerDAO answerDAO() {
        return new AnswerDAO();
    }
}
