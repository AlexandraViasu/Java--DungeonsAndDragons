package Adventurers.Nukers;

import Summons.IDefendAndAttack;
import Adventurers.Nukers.Spells.ISpell;

public class Wizard extends Mage {


    public Wizard(String name, int healthValue, ISpell spell, IDefendAndAttack summon) {
        super(name, healthValue, spell, summon);
    }
}

