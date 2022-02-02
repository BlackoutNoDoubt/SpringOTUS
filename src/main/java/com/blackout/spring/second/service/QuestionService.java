package com.blackout.spring.second.service;

import com.blackout.spring.second.domain.Question;
import com.blackout.spring.second.dao.QuestionDAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class QuestionService {
    private final QuestionDAO questionDAO;

    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    /**
     *
     * @return Возвращает все вопросы в том порядке, в котором они записаны в файл.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public List<Question> getAllQuestions() throws FileNotFoundException, IOException {
        return questionDAO.readAllQuestions();
    }

    /**
     *
     * @return Возвращает один вопрос в порядке очереди.
     */
    public Question getQuestion() {
        return questionDAO.readOneQuestion();
    }
}
