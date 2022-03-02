package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    In the console, allow a user to get information about each GuestService and Enclosure building
//    and print that information to the console.
//
//    Bonus: Create a menu item that lets the user search for a specific animal type
//    and find what enclosure they are in.

    public static void main(String[] args) {
        //Add animals to Zoo
        Monkey[] animalsInPrimateEnclosure = new Monkey[3];

        animalsInPrimateEnclosure[0] = new Monkey("Mammal", "Monkey", "Baboon", 4, "Nuts, Fruits, and Grasses");
        animalsInPrimateEnclosure[1] = new Monkey("Mammal", "Monkey", "Gorilla", 2, "Bamboo shoots and Fruit");
        animalsInPrimateEnclosure[2] = new Monkey("Mammal", "Monkey", "Orangutan", 1, "Fruits, Leaves and Insects");

        Snake[] animalsInReptileEnclosure = new Snake[3];

        animalsInReptileEnclosure[0] = new Snake("Reptile", "Snake", "Bull Python", 2, "Mice");
        animalsInReptileEnclosure[1] = new Snake("Reptile", "Snake", "Diamondback", 5, "Mice");
        animalsInReptileEnclosure[2] = new Snake("Reptile", "Snake", "Copperhead", 1, "Mice");

        //animal Enclosures -
        AnimalEnclosure primateEnclosure = new AnimalEnclosure("South-side", "Primate Enclosure", animalsInPrimateEnclosure, 1000, "2:00 - 3:00 pm");
        AnimalEnclosure reptileEnclosure = new AnimalEnclosure("East-side", "Reptile Enclosure", animalsInReptileEnclosure, 800, "9:00-10:00 am");

        String allPrimates = " ";
        for (int p = 0; p < animalsInPrimateEnclosure.length; p++) {
            allPrimates += animalsInPrimateEnclosure[p];
        }

        String allReptiles = " ";
        for (int r = 0; r < animalsInReptileEnclosure.length; r++) {
            allReptiles += animalsInReptileEnclosure[r];
        }


        //GuestServices
        List<String> allRestaurants = new ArrayList<>();
        allRestaurants.add("King Panda");
        allRestaurants.add("Pizza Palace");
        allRestaurants.add("Steak Hut");

        GuestServices guestServices = new GuestServices("front", "Guest Services", allRestaurants, "Bathroom", "Visitor Center");
//      Start of Zoo
        Scanner myScanner = new Scanner(System.in);
        boolean exitMenu = true;

        System.out.println("Welcome to the Wild Encounter Zoo!");
        do {
            System.out.println("Please choose an option: Guest Services [1], Animal Enclosures [2], Search for an Animal [3], Exit [4]");
            int userInput = myScanner.nextInt();
            if (userInput == 1) {
                System.out.println("Here are the different Services in the Guest Services Building: ");
                System.out.println("PRINT GUEST SERVICE INFO");
            }
            if (userInput == 2) {
                System.out.println("For more information about each Enclosure: Primate Enclosure[1], Reptile Enclosure[2]");
                int newInput = myScanner.nextInt();
                if (newInput == 1) {
                    primateEnclosure.buildingDetails();
                }
                if (newInput == 2) {
                    reptileEnclosure.buildingDetails();
                }
            }
            if (userInput == 3) {
                System.out.println("Which animal would you like view info on? There are Monkeys and Snakes");
                String userAnimalInput = myScanner.next();
                if (userAnimalInput.equals("Monkey") || userAnimalInput.equals("Monkys")) {
                    System.out.println(allPrimates);//use .contains to see if any of the lists contain the animal and if it is print info, if not get error message
                }
                if (userAnimalInput.equals("Snake") || userAnimalInput.equals("Snakes")) {
                    System.out.println(allReptiles);
                }
            }
            if (userInput == 4) {
                break;
            }

//        throw new NAMEOFEXPRESSIONFOR INVALID INPUT ("Invalid response, please choose one of the following options: " +
//                "Guest Services [1], Animal Enclosures [2], Search for an Animal [3]")
//        List<String> restaurant = new ArrayList<>();
//        restaurant.add("King Panda");
//
//	GuestServices restaurant1 = new GuestServices("King Panda", "Bathroom: 2", "SouthSide");
        }
        while (exitMenu);
    }
}
