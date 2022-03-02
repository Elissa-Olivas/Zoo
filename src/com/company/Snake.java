package com.company;

public class Snake extends Animal {
    private String diet;
    private int age;
    //name of snake

    //Snake Constructor
    public Snake (String animalType, String nameOfAnimal, String subType, int age, String diet) {
        super(animalType, nameOfAnimal, subType);
        this.age = age;
        this.diet = diet;
    }

    public int getAge() {

        return age;
    }

    public String getDiet() {

        return diet;
    }

    //Snake printDetails
    public void printDetails() {
        System.out.println("This Snake is a " + getSubType() + ". It is " + age + " years old and loves to eat " + diet);
    }
}
