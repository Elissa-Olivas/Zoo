package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalEnclosure extends Building {
    //primate enclosure
    //reptile enclosure
    private int capacity;
    private String feedingTime;
    private Animal[] animalsInEnclosure;

    //Animal Enclosure Constructor
    public AnimalEnclosure (String locationOfBuilding, String nameOfBuilding, Animal[] animalsInEnclosure, int capacity, String feedingTime) {
        super(locationOfBuilding, nameOfBuilding);
        this.animalsInEnclosure = animalsInEnclosure;
        this.capacity = capacity;
        this.feedingTime = feedingTime;
    }
    public String getFeedingTime() {
        return feedingTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public Animal[] getAnimalsInEnclosure() {
        return animalsInEnclosure;
    }


    //Animal Enclosure buildingDetails
    public void buildingDetails () {
        String allAnimals = "";
        for(int i = 0; i < animalsInEnclosure.length; i++) {
            allAnimals += animalsInEnclosure[i].getSubType() + ", " ;
        }
        System.out.println("The " + getNameOfBuilding() + " is located on the " + getLocationOfBuilding() + "" +
                " of the zoo. Which houses the " + allAnimals + ". " +
                "It has a capacity of " + capacity + " and Feeding time is between: " + feedingTime);
    }


    //get animal details
    public void printAnimalDetails () {
        String allAnimalDetails = "";
        for (int a = 0; a < animalsInEnclosure.length; a++) {
            allAnimalDetails += animalsInEnclosure[a] + ", ";
        }
    }

}
