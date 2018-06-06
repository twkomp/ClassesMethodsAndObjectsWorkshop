package com.company;

public class Pet {
    public Pet(String ownerName, char gender, String petname, int age, String homeAdress) {
        this.ownerName = ownerName;
        this.gender = gender;
        this.petname = petname;
        this.age = age;
        this.homeAdress = homeAdress;
    }
    String sound;
    String ownerName;
    char gender;
    boolean catears;
    String petname;
    int age;
    String homeAdress;
    protected String makeSound() {

        return this.sound+"!!";

    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }
}
