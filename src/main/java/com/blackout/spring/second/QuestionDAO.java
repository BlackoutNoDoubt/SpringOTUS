package com.blackout.spring.second;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class QuestionDAO {
    private Question question;
    private static LinkedList<Question> list = new LinkedList<>();
    private static Queue<Question> queue = list;

    public QuestionDAO() throws FileNotFoundException{
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
