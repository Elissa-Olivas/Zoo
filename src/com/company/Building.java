package com.company;

public class Building {
    private String locationOfBuilding; //southside, northside, eastside, westside, front near entrance
    private String nameOfBuilding; // Primate Enclosure, Reptile Enclosure, Guest Services

    //building Constructor
    public Building (String locationOfBuilding, String nameOfBuilding) {
        this.locationOfBuilding = "Front";
        this.nameOfBuilding = "Guest Services";
    }
    public String getLocationOfBuilding() {

        return locationOfBuilding;
    }

    public String getNameOfBuilding() {

        return nameOfBuilding;
    }

    //Building printDetails
    public void buildingDetails () {
        System.out.println(nameOfBuilding + " is located at " + locationOfBuilding + " of the zoo.");
    }
}
