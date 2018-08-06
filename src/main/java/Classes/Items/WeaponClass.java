package Classes.Items;

import Abstract_Classes.Stats.AilmentStatsAClass;
import Abstract_Classes.Stats.BaseStatsAClass;
import Abstract_Classes.Stats.ElementStatsAClass;
import Abstract_Classes.ItemAClass;
import Enumerations.ElementEnumeration;
import Enumerations.ItemEnumeration;

import java.util.ArrayList;

public class WeaponClass extends ItemAClass {
    private ElementEnumeration elementType;
    private ArrayList<AbilityClass> ability;

    public WeaponClass(String name,
                       BaseStatsAClass stats,
                       ItemEnumeration type,
                       ElementStatsAClass elementResistanceMatrix,
                       AilmentStatsAClass ailmentResistanceMatrix,
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
