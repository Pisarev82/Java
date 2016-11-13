package ru.myproject.obstacles;

import ru.myproject.animals.Animal;

/**
 * Created by Tim on 12.07.2016.
 */
    public class Cross extends Obstacle {

        public Cross(int value) {
            super(value);
        }

        @Override
        public void doIt(Animal animal) {
            animal.cross(getValue());
        }

        @Override
        public String toString() {
            return "бег на дистанцию";
        }
}
