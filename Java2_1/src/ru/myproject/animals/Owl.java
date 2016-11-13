package ru.myproject.animals;

/**
 * Nikolay Pisarev on 05.11.2016.
 * Version 0.2
 */
public class Owl extends Animal implements Jumpable, Swimable, NightSeeing {
    private static final int MAX_CROSS_DIST = 450;
    private static final int MAX_JUMP_HEIGHT = 10;
    private static final int MAX_SWIM_DIST = 201;
    private static final int MAX_NIGHT_SEEING_DIST = 2000;

    public Owl(String name) {
        super(name, Owl.MAX_CROSS_DIST);
    }

    @Override
    public void jump(int height) {
        if(height < Owl.MAX_JUMP_HEIGHT) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public void swim(int dist) {
        if(dist < Owl.MAX_SWIM_DIST) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public void nightSeeing(int dist) {
        if(dist < Owl.MAX_NIGHT_SEEING_DIST) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }
    @Override
    public String toString() {
        return "Сова " + getName();
    }
}
