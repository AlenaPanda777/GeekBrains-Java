package ru.geekbrains.java1.lesson1.hw1;

public class HW1_1 {
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    // с плавающей точкой,где a, b, c, d – целочисленные входные параметры
    public static float calculate ( int a, int b, int c, float d ) {
        return a * (b + (c / d));
    }
    public static void main(String[] args) {
        float i;
        i=calculate(1,2,-3,2);
        System.out.println(i);

        // if (d != 0) {
        //   System.out.println(i);
        // } else {
        //    System.out.println("На ноль делить нельзя!");
    }
}
