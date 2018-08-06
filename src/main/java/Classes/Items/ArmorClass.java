package Classes.Items;

import Abstract_Classes.ItemAClass;
import Abstract_Classes.Stats.AilmentStatsAClass;
import Abstract_Classes.Stats.BaseStatsAClass;
import Abstract_Classes.Stats.ElementStatsAClass;
import Enumerations.ItemEnumeration;

import java.util.ArrayList;

public class ArmorClass extends ItemAClass {
    private ArrayList<AbilityClass> ability;

    public ArmorClass(String name,
                      BaseStatsAClass stats,
                      ItemEnumeration type,
                      ElementStatsAClass elementResistanceMatrix,
                      AilmentStatsAClass ailmentResistanceMatrix,
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
