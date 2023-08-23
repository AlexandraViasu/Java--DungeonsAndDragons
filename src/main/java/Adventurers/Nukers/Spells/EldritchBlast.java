package Adventurers.Nukers.Spells;

import Enemies.Enemy;

public class EldritchBlast implements ISpell{
    private final int damage;


    public EldritchBlast(){
        this.damage = 40;
    }

    public int getDamage() {
        return damage;
    }
    public void cast(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
