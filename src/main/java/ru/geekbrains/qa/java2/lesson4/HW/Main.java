package ru.geekbrains.qa.java2.lesson4.HW;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("World"); // Duplicate A
        wordList.add("Sun");
        wordList.add("Sea");   // Duplicate B
        wordList.add("Rain");
        wordList.add("Dog");
        wordList.add("Cat");
        wordList.add("Mouse");
        wordList.add("World");  // Duplicate A
        wordList.add("Java");
        wordList.add("Sea");    // Duplicate B
        wordList.add("World");  // Duplicate A
        wordList.add("Winter");
        wordList.add("Wind");

        System.out.println("==== Исходный список ====\n");

        System.out.println(wordList);


        System.out.println("==== №1 Простой способ получить уникальный список ====\n");

        Set<String> uniqueList = new HashSet<>(wordList);

        System.out.println(uniqueList);

        for (String s : wordList) {
            int frequency = Collections.frequency(wordList, s);
            System.out.printf("Слово %s встречается %d раз(а)\n", s, frequency);
        }

        System.out.println("\n==== №2 Более самописный способ ====");

        Map<String, Integer> uniqueWords = new HashMap<>();
        for (String current : wordList) {
            if (uniqueWords.containsKey(current)) {
                uniqueWords.put(current, uniqueWords.get(current) + 1);
            } else {
                uniqueWords.put(current, 1);
            }
        }
        System.out.println(uniqueWords);

        System.out.println("============================================");

    }


    public static void task2() {

        Contacts contacts = new Contacts();
        contacts.add("Андреев", "81111111111");
        contacts.add("Андреев", "81111111121");
        contacts.add("Андреев", "81111111131");
        contacts.add("Иванов", "81121111141");
        contacts.add("Иванов", "81111311171");
        contacts.add("Иванов", "81411111119");
        contacts.add("Иванов", "82111111221");
        contacts.add("Петров", "81511111117");
        contacts.add("Петров", "81117111111");
        contacts.add("Сидоров", "81119111111");

        contacts.printNames();

        List<String> phones = contacts.getPhones("Иванов");

        System.out.println(phones);
    }

}
