package ru.geekbrains.java1.lesson1.hw1;

public class HW1_2 {
    //Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма
    // лежит в пределах от 10 до 20(включительно), если да – вернуть true,
    // в противном случае – false;
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int i;
        i = sum(10, 22);
        System.out.println(i);
        boolean b0 = i <= 20;
        if (b0 && i >= 10) {
            System.out.println("It's OK!");
        } else {
            System.out.println("Введите другие значения!" +" "+
                    "10>=Сумма<=20");
        }
    }
}