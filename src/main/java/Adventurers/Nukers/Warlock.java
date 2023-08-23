package Adventurers.Nukers;

import Adventurers.Nukers.Spells.ISpell;
import Summons.IDefendAndAttack;

public class Warlock extends Mage {


    public Warlock(String name, int healthValue, ISpell spell, IDefendAndAttack summon) {
        super(name, healthValue, spell, summon);
    }

}
