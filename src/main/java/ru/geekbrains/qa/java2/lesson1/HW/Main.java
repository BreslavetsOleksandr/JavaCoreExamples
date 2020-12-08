package ru.geekbrains.qa.java2.lesson1.HW;

import ru.geekbrains.qa.java2.lesson1.HW.competitors.Cat;
import ru.geekbrains.qa.java2.lesson1.HW.competitors.Competitor;
import ru.geekbrains.qa.java2.lesson1.HW.competitors.Human;
import ru.geekbrains.qa.java2.lesson1.HW.competitors.Robot;
import ru.geekbrains.qa.java2.lesson1.HW.obsiticles.Cross;
import ru.geekbrains.qa.java2.lesson1.HW.obsiticles.Obstacle;
import ru.geekbrains.qa.java2.lesson1.HW.obsiticles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Вася"), new Cat("Персик"), new Robot("Терминатор")};
        Obstacle[] obstacles = {new Cross(500), new Wall(25), new Cross(800), new Wall(50)};

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
