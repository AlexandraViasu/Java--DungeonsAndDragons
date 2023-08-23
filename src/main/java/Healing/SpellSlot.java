package Healing;

import Adventurers.Adventurer;

public class SpellSlot implements IHeal{

        private int heal;


        public SpellSlot(){
            this.heal = 15;
        }
        
        public void heal(Adventurer adventurer) {
            adventurer.getHealed(heal);
        }

}
