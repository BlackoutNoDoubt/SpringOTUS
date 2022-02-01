package com.blackout.spring.second;

import java.io.IOException;

public class GeneralService {
    private QuestionService questionService;
    private AnswerService answerService;

    public GeneralService(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    /**
     * Основной сервис, объединяющий QuestionService и AnswerService.
     * @throws IOException
     */
    public void start() throws IOException {
        System.out.println(questionService.getAllQuestions());
        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());

        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());

        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());
    }

}
