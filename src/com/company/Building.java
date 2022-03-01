package com.company;

public class Building {
    private String locationOfBuilding; //southside, northside, eastside, westside, front near entrance
    private String nameOfBuilding; // Primate Enclosure, Reptile Enclosure, Guest Services

    public String getLocationOfBuilding() {

        return locationOfBuilding;
    }

    public String getNameOfBuilding() {

        return nameOfBuilding;
    }


    public void buildingDetails () {
        System.out.println("The " + nameOfBuilding + " is located at " + locationOfBuilding + " of the zoo.");
    }
}
