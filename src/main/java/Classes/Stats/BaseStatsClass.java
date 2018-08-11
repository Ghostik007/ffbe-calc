package Classes.Stats;

import Abstract_Classes.BaseStatsAClass;
import Classes.Limits.DefaultModificatorLimit;

public class BaseStatsClass extends BaseStatsAClass {
    protected DefaultModificatorLimit statsLimit_i;
    protected int evasion;
    protected int provocation;
    protected int HPTurn;
    protected int MPTurn;

    public BaseStatsClass(int HP, int MP, int ATK, int MAG, int DEF, int SPR, DefaultModificatorLimit statsLimit_i, int evasion, int provocation, int HPTurn, int MPTurn) {
        super(HP, MP, ATK, MAG, DEF, SPR);
        this.statsLimit_i = statsLimit_i;
        this.evasion = evasion;
        this.provocation = provocation;
        this.HPTurn = HPTurn;
        this.MPTurn = MPTurn;
    }

    public DefaultModificatorLimit getStatsLimit_i() {
        return statsLimit_i;
    }

    public void setStatsLimit_i(DefaultModificatorLimit statsLimit_i) {
        this.statsLimit_i = statsLimit_i;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getProvocation() {
        return provocation;
    }

    public void setProvocation(int provocation) {
        this.provocation = provocation;
    }

    public int getHPTurn() {
        return HPTurn;
    }

    public void setHPTurn(int HPTurn) {
        this.HPTurn = HPTurn;
    }

    public int getMPTurn() {
        return MPTurn;
    }

    public void setMPTurn(int MPTurn) {
        this.MPTurn = MPTurn;
    }
}
