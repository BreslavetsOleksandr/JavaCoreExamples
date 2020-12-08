package ru.geekbrains.qa.java2.lesson1.HW.obsiticles;

import ru.geekbrains.qa.java2.lesson1.HW.competitors.Competitor;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}