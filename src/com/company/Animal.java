package com.company;

public class Animal {
    private String animalType; //mammal, reptile
    private String nameOfAnimal; //Monkey, Snake

    public Animal (String animalType, String nameOfAnimal) {
        this.animalType = animalType;
        this.nameOfAnimal = nameOfAnimal;
    }


    public String getAnimalType() {
        return animalType;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }


    public void printDetails () {
        System.out.println("there are multiple types of Animals at the zoo. Including: " + animalType + "-" + nameOfAnimal);
    }
}

