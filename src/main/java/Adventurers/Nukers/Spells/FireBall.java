package Adventurers.Nukers.Spells;

import Enemies.Enemy;

import java.util.Random;

public class FireBall implements ISpell {

    private final int damage;


    public FireBall(int damage){
        this.damage = 70;
    }

    public int getDamage() {
        return damage;

    }

    public void cast(Enemy enemy){
        enemy.takeDamage(damage);
    }

}