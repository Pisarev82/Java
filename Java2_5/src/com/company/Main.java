package com.company;

import java.util.Arrays;

/**
 *  Created by nikolaypisarev on 20.11.16.
 */
public class Main {

    public static void main(String[] args) {
        // Объявление переменных
        long startTime;
        float value = 0;
        final int SIZE = 10000000;
        int newSize;
        int numberOfThreads = 2;
        float[] bigArrays = new float[SIZE];
        bigArrays[1] = 1f; // Присвоение элементу массива значения не равного другим значениям массива
        // для проверки тестового метода
        Test test = new Test();
        test.elementsArrayEqual1(bigArrays, value); // Проверка работы тестового метода при наличии неравных элементов
        value = 1f;
        Arrays.fill(bigArrays, value);// Заполняем значения массива единицами
        test.elementsArrayEqual1(bigArrays, value); // Проверка работы тестового метода когда все элементы равны

        FillTheArray fillingArray = new FillTheArray(bigArrays, SIZE, 1);
        Thread t0 = new Thread(fillingArray);
        startTime = System.currentTimeMillis(); // засекаем время для заполнения массива в главном потоке
        t0.run(); // Долго заполняем массив в основном потоке
        // метод run() использовался чтобы не дублировать код
        test.elementsArrayEqual1(bigArrays, value);

        float executionTime = (System.currentTimeMillis() - startTime);
        System.out.println("время исполнения в основном потоке:" + executionTime + "наносекунд");

        Arrays.fill(bigArrays, value);// Заполняем значения массива единицами для чистоты эксперемента
        startTime = System.currentTimeMillis(); // засекаем время на разбивку массива и заполнение его в двух потоках
        newSize = SIZE/numberOfThreads;
        float[] a1 = new float[newSize];
        float[] a2 = new float[newSize];
        System.arraycopy(bigArrays, 0, a1, 0, newSize);
        System.arraycopy(bigArrays, newSize, a2, 0, newSize);
        FillTheArray fillingArray1 = new FillTheArray(a1, SIZE, numberOfThreads);
        Thread t1 = new Thread(fillingArray1);
        t1.start(); // открываем один поток
        FillTheArray fillingArray2 = new FillTheArray(a2, SIZE, numberOfThreads);
        Thread t2 = new Thread(fillingArray2);
        t2.start(); // открываем второй поток
        try {
            t1.join(); 
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, bigArrays, 0, newSize);
        System.arraycopy(a2, 0, bigArrays, newSize, newSize);

        test.elementsArrayEqual1(bigArrays, value); // Потоки завершились одновременно, массив полностью заполнен.

        executionTime = (System.currentTimeMillis() - startTime); // Время исполнения улучшилось почти в 2 раза
        System.out.println("время исполнения в двух потоках:" + executionTime + "наносекунд");

    }
}
