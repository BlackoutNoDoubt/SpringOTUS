package com.blackout.spring.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingQuestionsFromFile {
    private static LinkedList<String> list = new LinkedList<>(); //Записываем в list все считанные из файла строки.
    private static Queue<String> queue = list; //Передаем list в очередь для получения строк в правильном порядке.

    public static List<String> readAllQuestions() throws FileNotFoundException {
        File file = new File("src/main/resources/questions.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) { list.add(scanner.nextLine()); }

        scanner.close();
        return list;
    }

    public static String getOneQuestion() {
        return queue.poll();
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----");
        System.out.println(ReadingQuestionsFromFile.readAllQuestions());
        System.out.println("-----");
        System.out.println(ReadingQuestionsFromFile.getOneQuestion());
        System.out.println(ReadingQuestionsFromFile.getOneQuestion());
        System.out.println(ReadingQuestionsFromFile.getOneQuestion());
    }
}
