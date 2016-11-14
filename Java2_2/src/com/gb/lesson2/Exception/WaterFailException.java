package com.gb.lesson2.Exception;

/**
 * Created by nikolaypisarev on 14.11.16.
 */
public class WaterFailException extends FailException {
    WaterFailException(String obstacleName, int obstacleValuo, String kindOfAnimal) {
        super(obstacleName, obstacleValuo, kindOfAnimal);
    }

    public WaterFailException(int obstacleValuo, String kindOfAnimal) {
        super(obstacleValuo, kindOfAnimal);
    }
}
