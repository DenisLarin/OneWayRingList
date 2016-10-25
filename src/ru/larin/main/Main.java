package ru.larin.main;

import ru.larin.oneWayRingList.RingList;

/**
 * Created by mrden on 25.10.2016.
 */
public class Main {
    private static RingList ringList;
    private static Person[] person;
    public static void main(String[] args) {
        ringList = new RingList();
        person = new Person[3];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            ringList.add(person[i]);
        }
        ringList.printRightToLeft();
        System.out.println("////");
        System.out.println(ringList.size());
    }
}
