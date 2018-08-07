package Classes.Items;

import Classes.Stats.AilmentStatsClass;
import Classes.Stats.BaseStatsClass;
import Classes.Stats.ElementStatsClass;
import Abstract_Classes.ItemAClass;
import Enumerations.ElementEnumeration;
import Enumerations.ItemEnumeration;

import java.util.ArrayList;

public class WeaponClass extends ItemAClass {
    private ElementEnumeration elementType;
    private ArrayList<AbilityClass> ability;

    public WeaponClass(String name,
                       BaseStatsClass stats,
                       ItemEnumeration type,
                       ElementStatsClass elementResistanceMatrix,
                       AilmentStatsClass ailmentResistanceMatrix,
                       ElementEnumeration elementType,
                       ArrayList<AbilityClass> ability) {
        super(name, stats, type, elementResistanceMatrix, ailmentResistanceMatrix);
        this.elementType = elementType;
        this.ability = ability;
    }

    public ElementEnumeration getElementType() {
        return elementType;
    }

    public void setElementType(ElementEnumeration elementType) {
        this.elementType = elementType;
    }

    public ArrayList<AbilityClass> getAbility() {
        return ability;
    }

    public void setAbility(ArrayList<AbilityClass> ability) {
        this.ability = ability;
    }
}
