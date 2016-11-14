package com.gb.lesson2.obstacles;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;
import com.gb.lesson2.Exception.FailException;
import com.gb.lesson2.Exception.WaterFailException;
import com.gb.lesson2.animals.Animal;
import com.gb.lesson2.animals.Swimable;

/**
 * Created by Tim on 13.07.2016.
 */
public class Water extends Obstacle {

    public Water(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) throws FailException {
        if (animal instanceof Swimable) {
            Swimable swimableAnimal = (Swimable) animal;
            try {
                swimableAnimal.swim(getValue());
            } catch (AnimalOutFromDistanceException e) {
                throw new WaterFailException(getValue(),  animal.toString());
            }
        } else {
            try {
                animal.crossFail();
            } catch (AnimalOutFromDistanceException e){
                throw new WaterFailException(getValue(),  animal.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "вода";
    }
}
