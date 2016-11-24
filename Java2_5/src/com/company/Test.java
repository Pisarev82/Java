package com.company;

/**
 * Created by nikolaypisarev on 20.11.16.
 */
public class Test {
    public void elementsArrayEqual1(float[] bigArrays, float value) {
        boolean equal;
        int i = 0;
        float testValue = 0;
        while (i < bigArrays.length) {
            if (i == bigArrays.length - 1) {
                testValue = bigArrays[i];
                equal = true;
                System.out.println("Тест Элементы массива " + testValue + " == " + bigArrays[0] + " " + equal);
                break;
            } else if (bigArrays[i] != bigArrays[i+1]) {
                equal = false;
                testValue = bigArrays[i+1];
                System.out.println("Элемент массива № " +(i+1)+ " содержит: " +testValue+ " == " + bigArrays[0]  + " " + equal);
                break;
            } i++;
        }
    }
}
