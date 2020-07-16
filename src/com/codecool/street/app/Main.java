package com.codecool.street.app;

import com.codecool.street.Street;
import com.codecool.street.house.House;
import com.codecool.street.person.Person;

public class Main {

    public static void main(String[] args) {

        House kossuth12 = new House(12);
        House kossuth14 = new House(14);

        Street kossuthStreet = new Street("Kossuth", kossuth12, kossuth14);

        Person richieRich = new Person("Richie Rich");
        kossuth12.buyBy(richieRich);
        kossuth14.buyBy(richieRich);

        Person residentEvil = new Person("Resident Evil");
        kossuth12.moveIn(residentEvil);
    }
}
