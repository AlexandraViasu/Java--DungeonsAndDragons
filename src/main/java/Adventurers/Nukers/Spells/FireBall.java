package Adventurers.Nukers.Spells;

import Enemies.Enemy;


public class FireBall implements ISpell {

    private final int damage;


    public FireBall(int damage){
        this.damage = 30;
    }

    public int getDamage() {
        return damage;

    }

    public void cast(Enemy enemy){
        enemy.takeDamage(damage);
    }

}