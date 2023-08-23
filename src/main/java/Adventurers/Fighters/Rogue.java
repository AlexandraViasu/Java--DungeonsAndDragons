package Adventurers.Fighters;
import Weapons.IWeapon;

import java.util.Random;
public class Rogue extends Fighter{
    private double chanceOfStealth;
    public Rogue(String name, int hP, IWeapon weapon) {
        super(name, hP, weapon);
    }

    public double getChanceOfStealth() {
        return chanceOfStealth;
    }

    public void hide(){
        Random random = new Random();
        double chanceOfStealth =  random.nextInt(100);
        if (chanceOfStealth <= 50.0) {
            this.chanceOfStealth += chanceOfStealth + 10;
        }
    }


}
