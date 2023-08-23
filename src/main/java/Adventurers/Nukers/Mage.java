package Adventurers.Nukers;
import Summons.IDefendAndAttack;
import Enemies.Enemy;
import Adventurers.Adventurer;
import Adventurers.Nukers.Spells.ISpell;

public class Mage extends Adventurer {

    private ISpell spell;
    private IDefendAndAttack summon;

    public Mage(String name, int hp, ISpell spell, IDefendAndAttack summon){
        super(name, hp);
        this.spell = spell;
        this.summon = summon;
    }

    public void setSpell(ISpell spell){
        this.spell = spell;
    }

    public void setSummon(IDefendAndAttack summon) {
        this.summon = summon;
    }

    public void defend(Enemy enemy){
        this.summon.defend(enemy);
    }

    public void attack(Enemy enemy){
        this.summon.attack(enemy);
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

}