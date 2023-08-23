package Enemies;

public class Undead extends Enemy{

    public Undead(int hP) {
        super(hP);
    }

    public void hasResistance(int damage) {
        if(damage >= 5) {
            takeDamage(damage / 2);
        }

    }

}
