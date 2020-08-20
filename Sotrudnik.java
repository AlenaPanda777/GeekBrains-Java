package ru.geekbrains.java1.lesson4;
//Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
public class Sotrudnik {
    private static final int CURRENT_YEAR = 2020;
    private String surname;
    private String name;
    private String second_name;
    private int salary;
    private int yearOfBirth;

//Конструктор класса должен заполнять эти поля при создании объекта;

    Sotrudnik(String surname, String name, String second_name, int salary, int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.second_name = second_name;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
    }

    //Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

    String getSurname(){
        return surname;
    }

    String getName(){
        return name;
    }

    String getSecond_name(){
        return second_name;
    }

    int getSalary(){
        return salary;
    }

    int getAge(){
        return CURRENT_YEAR - yearOfBirth;
    }
    //Вывести при помощи методов из пункта 3 ФИО и возраст.

    //Создать массив из 5 сотрудников. С помощью цикла вывести
    // информацию только о сотрудниках старше 40 лет;
    void ageOver40(){
        if (getAge() > 40)
            System.out.println(surname +" " + name + " "+ second_name+" " +salary + " "+ getAge());
    }



    String getInfo(){
        return String.format("surname: %s, name: %s, second_name %s, salary: %d, age: %d");
    }
}
