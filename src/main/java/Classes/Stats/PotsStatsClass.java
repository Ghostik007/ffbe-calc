package Classes.Stats;

import Abstract_Classes.BaseStatsAClass;
import Classes.Limits.PotsStatsLimit;

public class PotsStatsClass extends BaseStatsAClass {
    protected PotsStatsLimit potsLimit;

    public PotsStatsClass(int HP, int MP, int ATK, int MAG, int DEF, int SPR, PotsStatsLimit potsLimit) {
        super(HP, MP, ATK, MAG, DEF, SPR);
        this.potsLimit = potsLimit;
    }

    public PotsStatsLimit getPotsLimit() {
        return potsLimit;
    }

    public void setPotsLimit(PotsStatsLimit potsLimit) {
        this.potsLimit = potsLimit;
    }
}
