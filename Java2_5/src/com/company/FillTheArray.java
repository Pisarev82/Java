package com.company;

/**
 * Created by nikolaypisarev on 21.11.16.
 */
public class FillTheArray implements Runnable {
    float[] array;
    int size;
    int numberOfThreads;
    public FillTheArray (float[] array, int size, int numberOfThreads) {
        this.array = array;
        this.size = size;
        this.numberOfThreads = numberOfThreads;
    }

    public float[] fillTheArray () {
        for (int i = 0; i < size/numberOfThreads; i++) {
            array[i] = (float)(size*Math.sin(0.2f + size/5)*Math.cos(0.2f + size/5)*Math.cos(0.4f + size/2));
        }
        return array;
    }

    @Override
    public void run() {
        fillTheArray();
    }
}
