package Adventurers;
import Enemies.Enemy;
import Weapons.IWeapon;

public abstract class Adventurer {
    private String name;
    private int hP;

    public Adventurer(String name, int hP) {
        this.name = name;
        this.hP = hP;
    }

    public String getName() {
        return name;
    }

    public int gethP() {
        return hP;
    }

    public void takeDamage(int damage){
        this.hP -= damage;
    }

    public void attack(Enemy enemy, IWeapon weapon){
        weapon.attack(enemy);
    }

    public void getHealed(int healthPoints){
        this.hP += healthPoints;
    }
}
