package com.company;

public class Lecturer extends Person {
    public String lecturerChair;
    public int salary;

    public Lecturer(String firstname, String lastname, int age,
                    String lecturerChair, int salary) {
        super(firstname, lastname, age);
        this.lecturerChair = lecturerChair;
        this.salary = salary;

    }

    public String toString() {
         return lastname + " " + firstname +
                "\n Преподаватель кафедры " + lecturerChair +
                "\n Возраст: " + age +
                "\n Зарплата: " + salary + "\n"
                ;
    }
}
