package ru.geekbrains.java1.lesson5.HW5;
//Создать классы Собака и Кот с наследованием от класса Животное.
public abstract class Animal {
    protected final String name;
    protected final String color;
    protected final float jumpHeight;
    protected final float runLength;

    protected Animal (String name, String color, float jumpHeight, float runLength){
        this.name = name;
        this.color = color;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    public abstract void swim();
    public abstract void jump();
    public abstract void run();

    String getFullInfo() {
        return "Имя " + this.name + ", " +
                "Окрас " + this.color + ", " +
                "Высота прыжка " + this.jumpHeight + ", " +
                "Длина бега " + this.runLength + " ";
    }
    }

