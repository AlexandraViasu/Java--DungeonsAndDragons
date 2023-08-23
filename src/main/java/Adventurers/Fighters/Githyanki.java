package Adventurers.Fighters;

import Weapons.IWeapon;

import java.util.Random;

public class Githyanki extends Fighter {

    private int numberOfAttacks;

    public Githyanki(String name, int hP, IWeapon weapon){
        super(name, hP, weapon);
        this.numberOfAttacks = 0;
    }


    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public void getMultipleAttacks(){
        Random rand = new Random();
        int attacks =  rand.nextInt(2);
        this.numberOfAttacks += attacks + 1;
    }

    public String battleCry(){
        return "For Vlaakith!";
    }
}
