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

    public Street(String name, House... houses) {
        rename(name);
        Collections.addAll(this.houses, houses);
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
        return ((str != null) && (!"".equals(str)) && (str.matches("^[a-zA-Z]*$")));
    }
}
