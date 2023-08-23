package Summons;
import Enemies.Enemy;

import java.util.Random;

public class Dryad implements IDefendAndAttack{

    private final int damage;
    private int hP;

    public Dryad(){
        Random random = new Random();
        this.damage = random.nextInt(30) + 6;
    }
    public void defend(Enemy enemy) {
        this.hP -= damage;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }
}