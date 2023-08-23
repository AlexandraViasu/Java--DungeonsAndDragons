package Summons;
import Enemies.Enemy;

import java.util.Random;

public class FIreElemental implements IDefendAndAttack{

    private final int damage;
    private int hP;

    public FIreElemental(){
        Random random = new Random();
        this.damage = random.nextInt(5) + 2;
    }
    public void defend(Enemy enemy) {
        this.hP -= damage;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damage);
    }
}
