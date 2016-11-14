package com.gb.lesson2.Exception;

/**
 * Created by nikolaypisarev on 14.11.16.
 */
public class CrossFailException extends FailException {

    CrossFailException(String obstacleName, int obstacleValuo, String kindOfAnimal) {
        super(obstacleName, obstacleValuo, kindOfAnimal);
    }

    CrossFailException(int obstacleValuo, String kindOfAnimal) {
        super(obstacleValuo, kindOfAnimal);
    }

}



