package ru.geekbrains.qa.java2.lesson3.HW;

import ru.geekbrains.qa.java2.lesson3.HW.fruits.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private final ArrayList<T> fruitBox;

    public Box() {
        fruitBox = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public float getWeight() {
        if (fruitBox.isEmpty()) {
            return 0;
        }
        int numFruits = fruitBox.size();
        T fruit = fruitBox.get(0);
        float weight = fruit.getFruitWeight();

        return weight * numFruits;
    }

    public boolean compare(Box<? extends Fruit> o) {
        if (this.getWeight() == o.getWeight()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Box<? extends Fruit> o) {
        if (this.getWeight() == o.getWeight()) {
            return 0;
        } else if (this.getWeight() < o.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }

    public Box<T> unite(Box<T> srcBox) {
        this.fruitBox.addAll(srcBox.fruitBox);
        srcBox.fruitBox.clear();
        return this;
    }
}
