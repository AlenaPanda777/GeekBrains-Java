package ru.geekbrains.java1.lesson4;

public class HW4 {
    public static void main(String[] args){

        Sotrudnik s1 = new Sotrudnik("Фамильный", "Иван", "Иванович", 60000, 1995);
        Sotrudnik s2 = new Sotrudnik("Второй","Денис","Андреевич", 48000, 1985);
        Sotrudnik s3 = new Sotrudnik("Третий","Сергей","Михайлович", 56000, 1978);
        Sotrudnik s4 = new Sotrudnik("Четвертый","Евгений","Владимирович", 59000, 1979);
        Sotrudnik s5 = new Sotrudnik("Пятый","Вениамин","Александрович", 80000, 1986);


        //Вывести при помощи методов из пункта 3 ФИО и возраст.
        System.out.printf("surname: %s, name: %s, second_name: %s, age: %d\n",
                s1.getSurname(), s1.getName(), s1.getSecond_name(), s1.getAge());


        //Создать массив из 5 сотрудников. С помощью цикла вывести
        // информацию только о сотрудниках старше 40 лет;
        Object [] arr1 = {s1, s2, s3, s4, s5};

      //private static boolean ageOver40(Object[] arr1){
      //    for (int i = 0; i < arr1.length; i++){
      //        if (arr1[i] = [ surname,  , ,ageOver40>40]);
      //        return true;
      //
      //    }
      //}
        // Получилось обратиться только поочередно.
        // Так и не поняла,как обратиться к возрасту в массиве.

        s1.ageOver40();
        s2.ageOver40();
        s3.ageOver40();
        s4.ageOver40();
        s5.ageOver40();


    }
}
