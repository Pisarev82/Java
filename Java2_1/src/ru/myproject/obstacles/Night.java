package ru.myproject.obstacles;

import ru.myproject.animals.Animal;
import ru.myproject.animals.NightSeeing;

/**
 * Created by Nikolay Pisarev on 05.11.2016.
 * Version 0.1
 */
public class Night extends Obstacle {
    public Night(int value) {
        super(value);
    }

    @Override
    public void doIt(Animal animal) {
        if (animal instanceof NightSeeing) {
            NightSeeing swimableAnimal = (NightSeeing) animal;
            swimableAnimal.nightSeeing(getValue());
        } else {
            animal.crossFail();
        }
    }

    @Override
    public String toString() {
        return "Ночь";
    }
}
