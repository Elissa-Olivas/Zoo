package com.company;

public class Animal {
    private String animalType; //mammal, reptile
    private String nameOfAnimal; //Monkey, Snake

    public String getAnimalType() {
        return animalType;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void printDetails () {
        System.out.println("there are multiple types of Animals at the zoo: " + animalType + " " + nameOfAnimal);
    }
}

