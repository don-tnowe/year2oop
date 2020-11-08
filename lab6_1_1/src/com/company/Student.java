package com.company;

public class Student extends Person{
    public String studentGroup;
    public long studentCard;

    public Student(String firstname, String lastname, int age,
                   String studentGroup, long studentCard){
        super(firstname, lastname, age);
        this.studentGroup = studentGroup;
        this.studentCard = studentCard;
    }

    public String toString() {
        return lastname + " " + firstname +
               "\n Студент группы " + studentGroup +
               "\n Возраст: " + age +
               "\n Номер студенческого билета: " + studentCard + "\n"
               ;
    }
}
