package com.blackout.spring.second.service;

import com.blackout.spring.second.domain.Answer;
import com.blackout.spring.second.dao.AnswerDAO;

import java.io.IOException;

public class AnswerService {
    private final AnswerDAO answerDAO;

    public AnswerService (AnswerDAO answerDAO) {
        this.answerDAO = answerDAO;
    }

    /**
     * Вызывает внутри себя метод класса AnswerDAO,
     * записывающий ответ на вопрос в файл и возвращающий этот ответ.
     * @return Возвращает ответ на вопрос.
     * @throws IOException
     */
    public Answer writeAnswer() throws IOException {
        return answerDAO.setAnswer();
    }
}
