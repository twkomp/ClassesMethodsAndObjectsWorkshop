package com.company;

public class Dog extends Pet {

    int age;
    //char gender;
    //String name;
    boolean whiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    public Dog(String ownerName, char gender, String petname, int age, String homeAdress, double weight, boolean fur) {
        super(ownerName, gender, petname, age, homeAdress);
        this.weight = weight;
        this.fur = fur;
    }

//    public Dog(String ownerName, char gender, String petname, int age, String homeAdress) {
//        super(ownerName, gender, petname, age, homeAdress);
//    }

//    public Dog(String name, int legs, double weight, char gender) {
//        this.name = name;
//        this.legs = legs;
//        this.weight = weight;
//    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isWhiskers() {

        return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
