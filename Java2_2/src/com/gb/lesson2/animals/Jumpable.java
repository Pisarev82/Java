package com.gb.lesson2.animals;

import com.gb.lesson2.Exception.AnimalOutFromDistanceException;

/**
 * Created by Tim on 12.07.2016.
 */
public interface Jumpable  {
    void jump(int height) throws AnimalOutFromDistanceException;
}
