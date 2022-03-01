package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building {
    //represents - restaurants, bathrooms, visitor center, etc available to zoo guests.
    //should have several properties that a zoo guest service building might have, including a list of services offered
    List<String> restaurants = new ArrayList<>();

    private String location2 = "bathrooms";
    private String location3 = "visitor center";

    public String getLocation2 () {

        return location2;
    }

    public String getLocation3 () {

        return location3;
    }

    //GuestServices Constructor:
    public GuestServices (String locationOfBuilding, String nameOfBuilding, List<String> newRestaurants, String location2, String location3) {
        super(locationOfBuilding, nameOfBuilding);
        restaurants.addAll(newRestaurants);
        this.location2 = location2;
        this.location3 = location3;
    }

    //GuestServices buildingDetails
    public void buildingDetails () {
        super.buildingDetails();
        System.out.println("The " + getNameOfBuilding() + " is located at the " + getLocationOfBuilding() + "" +
                                "of the zoo. In " + getNameOfBuilding() + " There is " + restaurants + ", " +
                location2 + " and " + location3);
    }
}
