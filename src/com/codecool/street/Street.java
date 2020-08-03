package com.codecool.street;

import com.codecool.street.house.House;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Street {
    private String name;
    private Set<House> houses = new HashSet<>();

    public Street(String name) {
        this.name = name;
    }

    public void build(House house) {
        houses.add(house);
    }

    public boolean rename(String newName) {
        if(isStringOnlyLetters(newName)) {
            name = newName;
            return true;
        }
        return false;
    }

    private boolean isStringOnlyLetters(String str) {
        // TODO
        return true;
    }
}
