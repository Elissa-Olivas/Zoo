package com.company;

public class Monkey extends Animal {
    private String diet;
    private int age;
    //name of monkey


    //Monkey Constructor
    public Monkey (String animalType, String nameOfAnimal, String subType, int age, String diet) {
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

    //Monkey Print Details
    public void printDetails() {
        super.printDetails();
        System.out.println("This Monkey is a " + getSubType() + ". It is " + age + " years old and love to eat " + diet);

    }
}
