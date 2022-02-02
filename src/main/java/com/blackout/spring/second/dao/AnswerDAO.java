package com.blackout.spring.second.dao;

import com.blackout.spring.second.domain.Answer;

import java.io.*;
import java.util.Scanner;

public class AnswerDAO {
    private Answer answer;

    public AnswerDAO() {
    }

//    public void setAnswer(String answer) {
//        this.answer = new Answer(answer);
//    }

    /**
     * Записывает в файл ответ на вопрос.
     * @return Возвращает записанный в файл ответ на вопрос.
     * @throws IOException
     */
    public Answer setAnswer() throws IOException {
        String s;
        OutputStream file = new FileOutputStream("C:\\Users\\Blackout\\IdeaProjects\\SpringPractice\\src\\main\\resources\\questions.csv", true);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file));
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLine();
        writer.newLine();
        writer.write(s);

        writer.close();

        return this.answer = new Answer(s);
    }
}
