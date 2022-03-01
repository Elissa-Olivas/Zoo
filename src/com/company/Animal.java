package com.company;

public class Animal {
    private String animalType; //mammal, reptile
    private String nameOfAnimal; //Monkey, Snake
    private String subType;

    //Animal Constructor
    public Animal(String animalType, String nameOfAnimal, String subType) {
        this.animalType = animalType;
        this.nameOfAnimal = nameOfAnimal;
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    //  Animal Print Details
    public void printDetails() {
        System.out.println("there are multiple types of Animals at the zoo. Including: " + animalType + "-" + nameOfAnimal);
    }
}

