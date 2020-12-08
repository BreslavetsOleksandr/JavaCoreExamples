package ru.geekbrains.qa.java2.lesson1.HW.obsiticles;


import ru.geekbrains.qa.java2.lesson1.HW.competitors.Competitor;

public class Cross implements Obstacle {
    private final int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
