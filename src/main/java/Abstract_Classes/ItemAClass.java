package Abstract_Classes;

import Abstract_Classes.Stats.AilmentStatsAClass;
import Abstract_Classes.Stats.BaseStatsAClass;
import Abstract_Classes.Stats.ElementStatsAClass;
import Enumerations.ItemEnumeration;
import Interfaces.ItemInterface;
import Interfaces.Unit;

public abstract class ItemAClass implements ItemInterface {
    protected String name;
    protected BaseStatsAClass stats;
    protected ItemEnumeration type;
    protected ElementStatsAClass elementResistanceMatrix;
    protected AilmentStatsAClass ailmentResistanceMatrix;
    protected Unit wearOnUnit = null;

    public ItemAClass(String name,
                      BaseStatsAClass stats,
                      ItemEnumeration type,
                      ElementStatsAClass elementResistanceMatrix,
                      AilmentStatsAClass ailmentResistanceMatrix) {
        this.name = name;
        this.stats = stats;
        this.type = type;
        this.elementResistanceMatrix = elementResistanceMatrix;
        this.ailmentResistanceMatrix = ailmentResistanceMatrix;
    }

    public void wearOn(Unit unit) {
        wearOnUnit = unit;
    }

    public void unWear() {
        wearOnUnit = null;
    }
    //AilmentEnumeration elementType;
}
