package Adventurers.Healer;

import Healing.IHeal;
import Adventurers.Adventurer;

public class Cleric extends Adventurer{

    private IHeal medicine;

    public Cleric(String name, int hP, IHeal medicine ){
        super(name, hP);
        this.medicine = medicine;
    }

    public void setMedicine(IHeal medicine) {
        this.medicine = medicine;
    }

    public void heal(Adventurer adventurer){
        this.medicine.heal(adventurer);
    }

}