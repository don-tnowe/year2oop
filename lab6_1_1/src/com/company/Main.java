package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("/ Создание массива /\n");

        ArrayList<Person> people_array = new ArrayList<Person>();
        people_array.add(new Lecturer("Анатолий","Среда",48,"Информационные технологии",50000));
        people_array.add(new Student("Михаил", "Зубенко", 18, "ИТ2",195485));
        people_array.add(new Student("Максим", "Гоголь", 18, "ИТ2",124164));
        people_array.add(new Student("Алексей", "Михалыч", 19, "ИТ2",139127));
        people_array.add(new Student("Владислав", "Бебидонхёртмий", 19, "ИТ3",124797));
        for (Person i: people_array) {
            System.out.print(i.toString());
        }
    }
}
