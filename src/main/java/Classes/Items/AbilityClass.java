package Classes.Items;

import Abstract_Classes.ItemAClass;
import Abstract_Classes.Stats.AilmentStatsAClass;
import Abstract_Classes.Stats.BaseStatsAClass;
import Abstract_Classes.Stats.ElementStatsAClass;
import Enumerations.AbilityTypeEnumeration;
import Enumerations.ItemEnumeration;
import Interfaces.Unit;

import java.util.ArrayList;

public class AbilityClass extends ItemAClass {
    private String effect;
    private AbilityTypeEnumeration type;
    private ArrayList<Unit> targetLimit;

    public AbilityClass(String name,
                        BaseStatsAClass stats,
                        ItemEnumeration type,
                        ElementStatsAClass elementResistanceMatrix,
                        AilmentStatsAClass ailmentResistanceMatrix,
                        String effect,
                        AbilityTypeEnumeration type1,
                        ArrayList<Unit> targetLimit) {
        super(name, stats, type, elementResistanceMatrix, ailmentResistanceMatrix);
        this.effect = effect;
        this.type = type1;
        this.targetLimit = targetLimit;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public AbilityTypeEnumeration getType() {
        return type;
    }

    public void setType(AbilityTypeEnumeration type) {
        this.type = type;
    }
}
