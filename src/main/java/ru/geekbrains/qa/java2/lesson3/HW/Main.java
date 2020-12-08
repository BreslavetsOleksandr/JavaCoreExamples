package ru.geekbrains.qa.java2.lesson3.HW;

import ru.geekbrains.qa.java2.lesson3.HW.fruits.Apple;
import ru.geekbrains.qa.java2.lesson3.HW.fruits.Orange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1 задание

        String[] mamArr = {"мама", "мыла", "раму"};
        System.out.println(Arrays.toString(mamArr));
        changePlaces(mamArr, 0, 2);
        System.out.println(Arrays.toString(mamArr));

        // 2 задание
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.unite(appleBox);

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.printf("Коробка с яблоками весит: %.2f \r\n", appleBox.getWeight());
        System.out.printf("Коробка с яблоками №2 весит: %.2f \r\n", appleBox2.getWeight());
        System.out.printf("Коробка с апельсинами весит: %.2f \r\n", orangeBox.getWeight());

        if (appleBox2.compare(orangeBox)) {
            System.out.println("Коробки одинакового веса");
        } else {
            System.out.println("Коробка разного веса");
        }

        if (appleBox2.compareTo(orangeBox) == 0) {
            System.out.println("Коробки одинакового веса");
        } else if (appleBox2.compareTo(orangeBox) < 0) {
            System.out.println("Коробка яблок весит меньше чем коробка апельсинов");
        } else if (appleBox2.compareTo(orangeBox) > 0) {
            System.out.println("Коробка яблок весит больше коробки апельсинов");
        }

    }

    public static void changePlaces(String[] mamArr, int index1, int index2) {
        String a = mamArr[index1];
        mamArr[index1] = mamArr[index2];
        mamArr[index2] = a;
    }

}


