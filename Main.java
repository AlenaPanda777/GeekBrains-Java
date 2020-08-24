package ru.geekbrains.java1.lesson5.HW5;

import ru.geekbrains.java1.lesson5.HW5.pet.Cat;
import ru.geekbrains.java1.lesson5.HW5.pet.Dog;

public class Main {
    public static void main(String[]srgs){
        Cat c = new Cat ("Murzik", "Ginger",1.5f, 180f);
        Dog d = new Dog ("Dzhulba", "Black", 0.8f, 470f );

        Animal[] pet = {c,d};
        for (int i = 0; i < pet.length; i++) {
            System.out.println(pet[i].getFullInfo());
            pet[i].swim();
            pet[i].jump();
            pet[i].run();

        }
    }

}
