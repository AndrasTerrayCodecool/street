package com.codecool.street.house;

import java.util.HashSet;
import java.util.Set;

public class House {
    private int address;
    private Person owner;

    public House(int address) {
        this.address = address;
    }

    public void moveIn(Person resident) {
        residents.add(resident);
    }

}
