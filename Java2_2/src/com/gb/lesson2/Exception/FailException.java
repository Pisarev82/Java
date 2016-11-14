package com.gb.lesson2.Exception;

/**
 * Created by nikolaypisarev on 13.11.16.
 */
public class FailException extends AppException {
    private String obstacleName;
    private int obstacleValuo;
    private String kindOfAnimal;
    FailException (String obstacleName, int obstacleValuo, String kindOfAnimal) {
        this.obstacleName = obstacleName;
        this.obstacleValuo = obstacleValuo;
        this.kindOfAnimal = kindOfAnimal;
    }

    FailException(int obstacleValuo, String kindOfAnimal) {
        this.obstacleValuo = obstacleValuo;
        this.kindOfAnimal = kindOfAnimal;
    }


    public String getFailInfo(){
        return kindOfAnimal + " выбыл на препятствии " + obstacleName + " размером " + obstacleValuo;
    }
}
