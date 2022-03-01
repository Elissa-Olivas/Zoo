package com.company;

public class Snake extends Animal {
    private String subType; // python, dimondback
    private String diet;
    private int age;
    //name of snake

    public Snake (String animalType, String nameOfAnimal, String subType, int age, String diet) {
        super(animalType, nameOfAnimal);
        this.subType = subType;
        this.age = age;
        this.diet = diet;
    }

    public String getSubType() {
        return subType;
    }
    public int getAge() {

        return age;
    }

    public String getDiet() {

        return diet;
    }



    public void printDetails() {
        super.printDetails();
        System.out.println("This Snake is a " + subType + ". It is " + age + " years old and love to eat " + diet);
    }
}
