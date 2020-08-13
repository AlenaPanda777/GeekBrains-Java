package ru.geekbrains.java1.lesson2.hw2;

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

        printArray(arr);
    }


       private static void printArray (int[] arr) {
        for (int i = 0; i < 10; i++){
            if (arr[i] > 0) {
                System.out.println(0 + " ");
            }else{
                System.out.println(1 + " ");
            }
            //while
            System.out.println();
              }

    }

    }

    //Успела сделать только одно задание. До начала занятия, буду доделать все остальное.




