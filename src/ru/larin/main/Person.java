package ru.larin.main;

import java.util.Scanner;

/**
 * Created by mrden on 25.10.2016.
 */
public class Person {
    private String name;
    private int age;
    private Scanner scanner;

    public Person() {
        setName();
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }
}
