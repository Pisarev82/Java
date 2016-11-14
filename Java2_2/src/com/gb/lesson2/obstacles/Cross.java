package com.gb.lesson2.obstacles;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;
import com.gb.lesson2.Exception.FailException;
import com.gb.lesson2.Exception.WallFailException;
import com.gb.lesson2.animals.Animal;

/**
 * Created by Tim on 12.07.2016.
 */
public class Cross extends Obstacle {

    public Cross(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws FailException {
        try {
            animal.cross(getValue());
        } catch (AnimalOutFromDistanceException e) {
            throw new WallFailException(getValue(),animal.toString());
        }
    }

    @Override
    public String toString() {
        return "бег на дистанцию";
    }
}
