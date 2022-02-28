package com.company;

public class Monkey extends Animal {
    private int age;
    private String diet;
    //types of monkeys - gorilla, red butt, ape
    //name of monkey

    public int getAge() {
        return age;
    }
    public String getDiet() {
        return diet;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("The Monkeys are " + age + " and love to eat " + diet);

    }
}
