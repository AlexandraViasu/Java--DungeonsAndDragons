package Healing;

import Adventurers.Adventurer;

public class Potion implements IHeal {

    private final int heal;


    public Potion(){
        this.heal = 10;
    }

    public void heal(Adventurer adventurer) {
        adventurer.getHealed(heal);
    }
}