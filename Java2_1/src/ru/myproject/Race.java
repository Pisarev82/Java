package ru.myproject;

import ru.myproject.animals.Animal;
import ru.myproject.obstacles.Obstacle;



/**
 * Created by Nikolay Pisarev on 06.11.2016.
 */
public class Race {
    Animal[] animals;
    Obstacle[] obstacles;
    Animal cat;
    Animal turtle;
    Animal duck;
    Animal owl;
    public Race (Animal[] animals, Obstacle[] obstacles) {
        this.animals = animals;
        this.obstacles = obstacles;
    }
    public Race (Obstacle[] obstacles, Animal cat, Animal turtle, Animal duck, Animal owl) {
        this.obstacles = obstacles;
        this.cat = cat;
        this.turtle = turtle;
        this.duck = duck;
        this.owl = owl;
    }
    public void race () {
        for (int i = 0; i < obstacles.length; i++) {
            Obstacle obstacle = obstacles[i];
            System.out.println("- Препятствие " + obstacle);
            for (int j = 0; j < animals.length; j++) {
                Animal animal = animals[j];
                if (animal.isOnDistance()) {
                    obstacle.doIt(animal);
                }
            }
        }
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal.isOnDistance()) {
                System.out.println(animal.getName() + " ФИНИШИРОВАЛ!!!");
            }
        }
    }
    public void raceWithObstacle (Obstacle obstacle) {
        for ( int j = 0; j < animals.length; j++) {
            Animal animal = animals[j];
            animal.setOnDistance(true);
        }
        for ( int j = 0; j < animals.length; j++) {
            Animal animal = animals[j];
            obstacle.doIt(animal);
        }
        for ( int j = 0; j < animals.length; j++) {
            Animal animal = animals[j];
            if (animal.isOnDistance()){
                System.out.println(animals[j] + " Прошел испытание: " + obstacle.getClass().getSimpleName());
            }
        }
    }
}
