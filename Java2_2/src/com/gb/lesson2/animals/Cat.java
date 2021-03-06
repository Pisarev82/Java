package com.gb.lesson2.animals;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;

/**
 * Created by Tim on 12.07.2016.
 */
public class Cat extends Animal implements Jumpable {

    private static final int MAX_CROSS_DIST = 1000;

    private static final int MAX_HEIGHT = 2;

    public Cat(String name) {
        super(name, MAX_CROSS_DIST);
    }

    @Override
    public void jump(int height) throws AnimalOutFromDistanceException {
        if(height < Cat.MAX_HEIGHT) {
            System.out.println(getName() + " продолжает путь!");
        } else {
            crossFail();
        }
    }

    @Override
    public String toString() {
        return "Кот " + getName();
    }
}
