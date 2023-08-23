package Weapons;
import Enemies.Enemy;
import java.util.Random;

public class Dagger implements IWeapon{


    public void attack(Enemy enemy) {
        Random rand = new Random();
        int randomDamage = rand.nextInt(4) + 4;
        enemy.takeDamage(randomDamage);
    }
}
