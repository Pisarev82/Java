package com.gb.lesson2.obstacles;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;
import com.gb.lesson2.Exception.FailException;
import com.gb.lesson2.Exception.WallFailException;
import com.gb.lesson2.animals.Animal;
import com.gb.lesson2.animals.Jumpable;

/**
 * Created by Tim on 12.07.2016.
 */
public class Wall extends Obstacle {

    public Wall(int value) {
        super(value);
    }

    @Override
    public void doIt (Animal animal) throws FailException {
        if (animal instanceof Jumpable) {
            Jumpable jumpableAnimal = (Jumpable) animal;
            try {
                jumpableAnimal.jump(getValue());
            } catch (AnimalOutFromDistanceException e) {
                throw new WallFailException (getValue(),  animal.toString());
            }
        } else {
            try {
                animal.crossFail();
            } catch (AnimalOutFromDistanceException e){
                throw new WallFailException (getValue(),  animal.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "стена";
    }
}
