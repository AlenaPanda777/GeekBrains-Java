package ru.geekbrains.java1.lesson1.hw1;

public class HW1_5 {
    //Написать метод, который определяет является ли год високосным.
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы
// метода в консоль
    public static int calculate(int a) {
        return a%4;
    }

    public static void main(String[] args) {
        int i;
        i = calculate(100);
        System.out.println(i);
        boolean b0 = i == 0;
        if (b0 && i == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }
}
