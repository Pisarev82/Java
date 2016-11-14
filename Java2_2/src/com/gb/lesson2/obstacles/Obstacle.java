package com.gb.lesson2.obstacles;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;
import com.gb.lesson2.Exception.FailException;
import com.gb.lesson2.animals.Animal;

/**
 * Created by Tim on 12.07.2016.
 */
public abstract class Obstacle {
    private int value;

    public abstract void doIt(Animal animal) throws FailException, AnimalOutFromDistanceException;

    public Obstacle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
