package com.company;

public class Building {
    private String locationOfBuilding;
    private String nameOfBuilding;

    public String getLocationOfBuilding() {
        return locationOfBuilding;
    }

    public String getNameOfBuilding() {
        return nameOfBuilding;
    }


    public void buildingDetails () {
        System.out.println("We have a few buildings " + nameOfBuilding + " located at " + locationOfBuilding);
    }
}
