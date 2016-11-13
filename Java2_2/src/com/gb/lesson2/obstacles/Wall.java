package com.gb.lesson2.obstacles;

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
    public void doIt(Animal animal) {
        if (animal instanceof Jumpable) {
            Jumpable jumpableAnimal = (Jumpable) animal;
            jumpableAnimal.jump(getValue());
        } else {
            animal.crossFail();
        }
    }

    @Override
    public String toString() {
        return "стена";
    }
}
