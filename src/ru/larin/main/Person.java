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
        System.out.println("Введите имя");
        scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        System.out.println("Введите возраст");
        scanner = new Scanner(System.in);
        this.age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
