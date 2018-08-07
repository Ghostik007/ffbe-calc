package Classes.Items;

import Abstract_Classes.ItemAClass;
import Classes.Stats.AilmentStatsClass;
import Classes.Stats.BaseStatsClass;
import Classes.Stats.ElementStatsClass;
import Enumerations.AbilityTypeEnumeration;
import Enumerations.ItemEnumeration;
import Interfaces.Unit;

import java.util.ArrayList;

public class AbilityClass extends ItemAClass {
    private String effect;
    private AbilityTypeEnumeration type;
    private ArrayList<Unit> targetLimit;

    public AbilityClass(String name,
                        BaseStatsClass stats,
                        ItemEnumeration type,
                        ElementStatsClass elementResistanceMatrix,
                        AilmentStatsClass ailmentResistanceMatrix,
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
