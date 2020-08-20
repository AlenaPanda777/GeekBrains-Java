package ru.geekbrains.java1.lesson1.hw1;

public class HW1_Right {
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    // с плавающей точкой,где a, b, c, d – целочисленные входные параметры
    public static float calculate ( int a, int b, int c, int d ) {
        return a * (b + (c *1/0f/ d));
    }
    //Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма
    // лежит в пределах от 10 до 20(включительно), если да – вернуть true,
    // в противном случае – false;
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен
    // проверить положительное ли число передали, или отрицательное.
    // Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    private static boolean isPosittve (int variable) {
        return variable>=0;
    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
    // Вывести приветствие в консоль.
    private static String welcome(String name){
        System.out.println("Привет, указанное имя!");
        return "Привет, " + name + "!";
    }
    //Написать метод, который определяет является ли год високосным.
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы
// метода в консоль
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        //Просто созданные переменные
        final int varOne = 1;
        final int varTwo = 2;
        final int varThree = 3;
        final int varFour = 4;
        //Переменнеые в "венгерской нотации", перед именем переменной строчной буквы обозначен ее тип
        final float fOne = 1f;
        final float fTwo = 2f;
        final float fThree = 3f;
        final float fFour = 4f;

        System.out.println("1. " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("2. " + checkTwoNumbers(1, 15));

        System.out.println("3. " + ((isPosittve(-5)) ? "positive" : "negative") + "!");

        System.out.println("4. " +welcome("Alena"));

        System.out.println("5. Leap? " + isLeapYear(2004));
    }
}
