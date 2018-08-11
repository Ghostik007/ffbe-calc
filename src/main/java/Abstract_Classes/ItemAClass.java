package Abstract_Classes;

import Classes.Stats.AilmentStatsClass;
import Classes.Stats.BaseStatsClass;
import Classes.Stats.ElementStatsClass;
import Enumerations.ItemEnumeration;
import Interfaces.ItemInterface;
import Interfaces.UnitInterface;

public abstract class ItemAClass implements ItemInterface {
    protected String name;
    protected BaseStatsClass stats;
    protected ItemEnumeration type;
    protected ElementStatsClass elementResistanceMatrix;
    protected AilmentStatsClass ailmentResistanceMatrix;
    protected UnitInterface wearOnUnitInterface = null;

    public ItemAClass(String name,
                      BaseStatsClass stats,
                      ItemEnumeration type,
                      ElementStatsClass elementResistanceMatrix,
                      AilmentStatsClass ailmentResistanceMatrix) {
        this.name = name;
        this.stats = stats;
        this.type = type;
        this.elementResistanceMatrix = elementResistanceMatrix;
        this.ailmentResistanceMatrix = ailmentResistanceMatrix;
    }

    public void wearOn(UnitInterface unitInterface) {
        wearOnUnitInterface = unitInterface;
    }

    public void unWear() {
        wearOnUnitInterface = null;
    }
    //AilmentEnumeration elementType;
}
