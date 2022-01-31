package com.blackout.spring.second;

import java.io.FileNotFoundException;
import java.util.List;

public class QuestionService {
    private final QuestionDAO questionDAO;

    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    public List<Question> getAllQuestions() throws FileNotFoundException {
        return questionDAO.readAllQuestions();
    }

    public Question getQuestion() {
        return questionDAO.readOneQuestion();
    }
}
