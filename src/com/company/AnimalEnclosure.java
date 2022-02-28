package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building {
    //primate enclosure
    //reptile enclosure
    private int yearBuilt;
    private int capacity;
    List<String> animalsInPrimateEnclosure = new ArrayList<>();
    List<String> animalsInReptileEnclosure = new ArrayList<>();

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getCapacity() {
        return capacity;
    }

    public void buildingDetails () {
        super.buildingDetails();
        System.out.println("the " + getNameOfBuilding() + " houses the " + animalsInPrimateEnclosure + " " +
                "which was built in " + yearBuilt + " and has a capacity of " + capacity);
        System.out.println("the "  + getNameOfBuilding() + "houses the " + animalsInReptileEnclosure + " " +
                "which was built in " + yearBuilt + " and has a capacity of " + capacity);
    }

}
