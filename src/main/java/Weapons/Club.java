package Weapons;

import Enemies.Enemy;

import java.util.Random;


public class Club implements IWeapon {

    public void attack(Enemy enemy) {
        Random random = new Random();
        int randomDamage = random.nextInt(4) + 4;

        if (randomDamage == 4) {
            randomDamage += 4;
        }

        enemy.takeDamage(randomDamage);
    }
}
