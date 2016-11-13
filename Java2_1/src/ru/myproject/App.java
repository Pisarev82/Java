package ru.myproject;

import ru.myproject.animals.*;
import ru.myproject.obstacles.*;

/**
 * Created by Tim on 12.07.2016.
 * Created by Nikolay Pisarev on 05.11.2016.
 * Version 0.1
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Готовимся к старту...");

        Animal[] animals = new Animal[4]; // размер массива не 3 а 4

        animals[0] = new Cat("Мурзик");
        animals[1] = new Duck("Квака");
        animals[2] = new Turtle("Череп");
        animals[3] = new Owl("Веточка");// Nikolay новое животное Сова

        Obstacle[] obstacles = new Obstacle[4];

        obstacles[0] = new Cross(400); //бег на 400 метров
        obstacles[1] = new Wall(3); //трехметровая стена
        obstacles[2] = new Water(200); //200 метров вплавь
        obstacles[3] = new Night(10); //10 метров в ночи Nikolay Новое препятсвие Ночь

        System.out.println("Старт!");

//        for (int i = 0; i < obstacles.length; i++) {
//            Obstacle obstacle = obstacles[i];
//            System.out.println("- Препятствие " + obstacle);
//            for (int j = 0; j < animals.length; j++) {
//                Animal animal = animals[j];
//                if (animal.isOnDistance()) {
//                    obstacle.doIt(animal);
//                }
//            }
//        }
//
//        for (int i = 0; i < animals.length; i++) {
//            Animal animal = animals[i];
//            if (animal.isOnDistance()) {
//                System.out.println(animal.getName() + " ФИНИШИРОВАЛ!!!");
//            }
//        }
        Race race = new Race(animals, obstacles);
        race.race();
        race.raceWithObstacle(obstacles[2]);
    }
}
