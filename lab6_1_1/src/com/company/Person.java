package com.company;

public class Person implements IPerson{
    public String firstname;
    public String lastname;

    public Person (String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String toString(){
        return lastname + " " + firstname + "\n Возраст: " + age + "\n";
    }
}