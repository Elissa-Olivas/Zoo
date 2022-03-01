package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building {
    //primate enclosure
    //reptile enclosure
    private int capacity;
    private double feedingTime;
    List<String> animalsInPrimateEnclosure = new ArrayList<>();
    List<String> animalsInReptileEnclosure = new ArrayList<>();

    public double getFeedingTime() {
        return feedingTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void buildingDetails () {
        super.buildingDetails();
        System.out.println("The " + getNameOfBuilding() + " is located on the " + getLocationOfBuilding() + "" +
                "of the zoo. Which houses the " + animalsInPrimateEnclosure + " " +
                "which has a capacity of " + capacity + " and has a Feeding time of: " + feedingTime);
        System.out.println("The "  + getNameOfBuilding() + " is located on the " + getLocationOfBuilding() + "" +
                "of the zoo. Which houses the " + animalsInReptileEnclosure + " " +
                "which has a capacity of " + capacity + " and has a Feeding time of: " + feedingTime);
    }

}
