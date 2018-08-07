package Classes.Items;

import Abstract_Classes.ItemAClass;
import Classes.Stats.AilmentStatsClass;
import Classes.Stats.BaseStatsClass;
import Classes.Stats.ElementStatsClass;
import Enumerations.ItemEnumeration;

import java.util.ArrayList;

public class ArmorClass extends ItemAClass {
    private ArrayList<AbilityClass> ability;

    public ArmorClass(String name,
                      BaseStatsClass stats,
                      ItemEnumeration type,
                      ElementStatsClass elementResistanceMatrix,
                      AilmentStatsClass ailmentResistanceMatrix,
                      ArrayList<AbilityClass> ability) {
        super(name, stats, type, elementResistanceMatrix, ailmentResistanceMatrix);
        this.ability = ability;
    }

    public ArrayList<AbilityClass> getAbility() {
        return ability;
    }

    public void setAbility(ArrayList<AbilityClass> ability) {
        this.ability = ability;
    }
}
