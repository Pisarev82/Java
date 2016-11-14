package com.gb.lesson2.Exception;

/**
 * Created by nikolaypisarev on 14.11.16.
 */
public class WallFailException extends FailException {
    WallFailException(String obstacleName, int obstacleValuo, String kindOfAnimal) {
        super(obstacleName, obstacleValuo, kindOfAnimal);
    }

    public WallFailException(int obstacleValuo, String kindOfAnimal) {
        super(obstacleValuo, kindOfAnimal);
    }
}
