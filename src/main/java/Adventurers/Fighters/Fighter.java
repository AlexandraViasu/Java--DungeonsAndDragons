package Adventurers.Fighters;

import Enemies.Enemy;
import Adventurers.Adventurer;
import Weapons.IWeapon;

public abstract class Fighter extends Adventurer {

    private IWeapon weapon;

    public Fighter(String name, int hP, IWeapon weapon){
        super(name, hP);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon){
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }



}