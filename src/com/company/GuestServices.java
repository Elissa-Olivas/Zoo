package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building {
    //represents - restaurants, bathrooms, visitor center, etc available to zoo guests.
    //should have several properties that a zoo guest service building might have, including a list of services offered
    //possible other properties: gift shop
    List<String> restaurants = new ArrayList<>();

    private String location2 = "Gift Shop";
    private String location3 = "Visitor Center";
    boolean hasBathrooms;

    public boolean getHasBathrooms() {
        return hasBathrooms;
    }

    public String getLocation2 () {

        return location2;
    }

    public String getLocation3 () {

        return location3;
    }

    //GuestServices Constructor:
    public GuestServices (String locationOfBuilding, String nameOfBuilding, List<String> newRestaurants, String location2, String location3, boolean hasBathrooms) {
        super(locationOfBuilding, nameOfBuilding);
        restaurants.addAll(newRestaurants);
        this.location2 = "Gift Shop";
        this.location3 = "Visitor Center";
        this.hasBathrooms = true;
    }

    //GuestServices buildingDetails
    public void buildingDetails () {
        super.buildingDetails();
        System.out.println(getNameOfBuilding() + " is located at the " + getLocationOfBuilding() + "" +
                                " of the zoo. In " + getNameOfBuilding() + " There are restaurants: " + restaurants + ", a " +
                location2 + " and a " + location3 + ". \n There is also a bathroom right next to " + location2 + ": " + hasBathrooms + ".");
    }
}
