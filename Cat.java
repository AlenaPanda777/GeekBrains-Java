package ru.geekbrains.java1.lesson5.HW5.pet;

import ru.geekbrains.java1.lesson5.HW5.Animal;

public class Cat extends Animal {

    public Cat(String name, String color, float jumpHeight, float runLength){
        super(name, color, jumpHeight, runLength);
    }
    @Override
    public void swim(){
        System.out.println(name + " плавать не умеет");
    }
    public void jump(){
        System.out.println(name + " подпрыгнул!");
    }
    public void run(){
        System.out.println(name + " добежал!");
    }
}
