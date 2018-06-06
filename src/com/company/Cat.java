package com.company;

public class Cat extends Pet {
    public Cat(String ownerName, char gender, String petname, int age, String homeAdress, double weight, boolean fur) {
        super(ownerName, gender, petname, age, homeAdress);
        this.weight = weight;
        this.fur = fur;
    }

    //char gender;
    int age;
//    String name;

    boolean whiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;
    @Override
    protected String makeSound() {
        return super.makeSound();
    }
//    public Cat(String ownerName, char gender, String petname, int age, String homeAdress) {
//        super(ownerName, gender, petname, age, homeAdress);
//    }

//    public String getName() {
//        return name;
//    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//    public Cat(String name, int legs, double weight,char gender) {
//        this.name = name;
//        this.legs = legs;
//        this.weight = weight;
//        this.gender = gender;
//        this.age = 0;
//    }

//    public void setName(String name) {
//        this.name = name;
//
    protected String catYears() {
        int catYears;
        switch (super.getAge()) {
            case (0): catYears = 0;
            break;
            case (1): catYears = 19;
            break;
            case (2): catYears = 24;
            break;
            default: catYears = (super.getAge() - 2) * 4 + 24;
            break;
        }
        return super.getPetname()+" is "+super.getAge()+" human years old and "+catYears+" years old in cat years";
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
