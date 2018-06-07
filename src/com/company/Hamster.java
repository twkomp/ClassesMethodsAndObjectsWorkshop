package com.company;

public class Hamster extends Pet {
    boolean smart;
    int speed;
    double size;
    boolean fur;

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public Hamster(String ownerName, char gender, String petname, int age, String homeAdress, boolean smart, int speed, double size, boolean fur) {
        super(ownerName, gender, petname, age, homeAdress);
        this.smart = smart;
        this.speed = speed;
        this.size = size;
        this.fur = fur;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }
}
