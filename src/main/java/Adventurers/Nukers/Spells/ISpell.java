package Adventurers.Nukers.Spells;
import Enemies.Enemy;
import Adventurers.Adventurer;


public interface ISpell {
    void cast(Enemy Enemy);

    int getDamage();

}
