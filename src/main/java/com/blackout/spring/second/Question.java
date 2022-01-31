package com.blackout.spring.second;

public class Question {
    private static int counter;
    private int id;
    private String question;

    public Question(String question) {
        this.id = counter++;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                '}';
    }
}
