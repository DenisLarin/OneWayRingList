package ru.larin.main;

import ru.larin.oneWayRingList.RingList;

/**
 * Created by mrden on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        RingList ringList = new RingList();
        ringList.add("1");
        ringList.add("2");
        ringList.add("3");
        ringList.add("4");
        ringList.add("5");
        ringList.add("6");
        ringList.add("7");
        ringList.add("8");
        ringList.add("9");
        ringList.add("10");
        ringList.add("11");
        ringList.print();
    }
}
