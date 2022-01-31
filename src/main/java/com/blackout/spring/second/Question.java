package com.blackout.spring.second;

public class Question {
    private static int counter;
    private int id; //номер вопроса
    private String question; //непосредственно сам вопрос

    public Question(String question) {
        this.id = ++counter;
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
                "id=" + id +
                ", question='" + question + '\'' +
                '}';
    }
}
