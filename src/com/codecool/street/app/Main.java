package com.codecool.street.app;

import com.codecool.street.Street;
import com.codecool.street.house.House;
import com.codecool.street.house.Person;

public class Main {

    public static void main(String[] args) {

        House kossuth12 = new House(12);
        House kossuth14 = new House(14);

        Street kossuthStreet = new Street("Kossuth", kossuth12, kossuth14);
        Street petofiStreet;
        new Street("Petofi");

        Person richieRich = new Person("Richie Rich");
        kossuth12.moveIn(richieRich);
        richieRich.buy(kossuth12);
        richieRich.buy(kossuth14);

        kossuth14.moveIn(new Person("Resident Evil"));

        System.out.println("Check object relationships here! :)");
    }
}
