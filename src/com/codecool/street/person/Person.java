package com.codecool.street.person;

import com.codecool.street.house.House;

import java.util.Set;

public class Person {
    private String name;
    private Set<House> properties;

    public Person(String name) {
        this.name = name;
    }

    public void buy(House house) {
        properties.add(house);
    }
}
