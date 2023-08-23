package Enemies;

public class Guards extends Enemy{
    public Guards(int hP) {
        super(hP);
    }

    public void hasRage(int damage) {
        if(damage <= 2) {
            takeDamage(damage / 5);
        }

    }
}
