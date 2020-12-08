package ru.geekbrains.qa.java2.lesson1.HW.competitors;

public class Cat implements Competitor {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    private boolean active;

    public Cat(String name) {
        this.name = name;
        this.maxRunDistance = 200;
        this.maxJumpHeight = 10;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал кросс!");
        } else {
            active = false;
            System.out.println(name + " не пробежал кросс!");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул стену!");
        } else {
            active = false;
            System.out.println(name + " не перепрыгнул стену!");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }
}
