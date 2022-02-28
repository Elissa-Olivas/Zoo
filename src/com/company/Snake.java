package com.company;

public class Snake extends Animal {
    private int age;
    private String diet;
    //types of snakes "bull snake
    //name of snake "charlie"

    public int getAge() {
        return age;
    }

    public String getDiet() {
        return diet;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("The Snakes are " + age + " and love to eat " + diet);
    }
}
