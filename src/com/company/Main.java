package com.company;



public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat("Timmie", 'm', "noobie", 8, "Anti-EmojiVille", 5.2, true);
        myCat.setLegs(4);
        System.out.println(myCat.ownerName);
        System.out.println(myCat.legs);
    }
}
