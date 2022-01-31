package com.blackout.spring.second;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class QuestionDAO {
    private Question question;
    private static LinkedList<Question> list = new LinkedList<>(); //список, в который попадут считанные из файла вопросы.
    private static Queue<Question> queue = list;  //очередь, из которой удобно доставать по одному вопросу в правильном порядке.

    public QuestionDAO() {
    }

    public List<Question> readAllQuestions() throws FileNotFoundException {
        File file = new File("src/main/resources/questions.csv");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            list.add(new Question(scanner.nextLine()));
        }
        scanner.close();
        return list;
    }

    public Question readOneQuestion() {
        return queue.poll();
    }
}
