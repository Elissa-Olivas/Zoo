package com.company;

public class Monkey extends Animal {
    private String subType; // gorilla, baboon, orengateng
    private String diet;
    private int age;
    //name of monkey

    public Monkey (String animalType, String nameOfAnimal, String subType, int age, String diet) {
        super(animalType, nameOfAnimal);
        this.subType = subType;
        this.age = age;
        this.diet = diet;
    }


    public int getAge() {
        return age;
    }
    public String getSubType() {
        return subType;
    }
    public String getDiet() {
        return diet;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("This Monkey is a " + subType + ". It is " + age + " years old and love to eat " + diet);

    }
}
