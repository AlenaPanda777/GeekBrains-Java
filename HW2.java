package ru.geekbrains.java1.lesson2.hw2;

import java.util.Arrays;

public class HW2 {

    //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;

        int[] arr1 = new int[8];

        printArray(arr);

        fillArray(arr1);


        }



    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(0 + " ");
            } else {
                System.out.println(1 + " ");
            }
            //while
            System.out.println();
        }
    }


    //Успела сделать только одно задание. До начала занятия, буду доделывать
// все остальное.
    //2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью
// цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    private static void fillArray (int[] arr1) {
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = j+3;
            System.out.println(arr1[1]);
        }
    }
}

