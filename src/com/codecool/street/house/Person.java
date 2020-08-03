package com.codecool.street.house;

import com.codecool.street.house.House;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Set<House> properties = new HashSet<>();

    public void buy(House house) {
        properties.add(house);
        house.buyBy(this);
    }
}
