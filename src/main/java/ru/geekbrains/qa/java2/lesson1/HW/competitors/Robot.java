package ru.geekbrains.qa.java2.lesson1.HW.competitors;

public class Robot implements Competitor {
    private String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    private boolean active;

    public Robot(String name) {

        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeight = 600;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал кросс!");
        } else {
            active = false;
            System.out.println(name + " не справился с кроссом!");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул стену!");
        } else {
            active = false;
            System.out.println(name + " не смог перепрыгнуть стену!");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }
}
