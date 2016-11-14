package com.gb.lesson2.animals;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;

/**
 * Created by Tim on 13.07.2016.
 */
public interface Swimable {
    void swim(int dist) throws AnimalOutFromDistanceException;
}
