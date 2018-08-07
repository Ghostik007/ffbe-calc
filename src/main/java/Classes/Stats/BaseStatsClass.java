package Classes.Stats;

import Classes.Stats.Limits.DefaultModificatorLimit;

public class BaseStatsClass {
    protected DefaultModificatorLimit statsLimit_i;

    protected int HP;
    protected int MP;
    protected int ATK;
    protected int MAG;
    protected int DEF;
    protected int SPR;
    protected int evasion;
    protected int provocation;

    protected int HP_i;
    protected int MP_i;
    protected int ATK_i;
    protected int MAG_i;
    protected int DEF_i;
    protected int SPR_i;

    public BaseStatsClass(int HP,
                          int MP,
                          int ATK,
                          int MAG,
                          int DEF,
                          int SPR,
                          int evasion,
                          int provocation,
                          DefaultModificatorLimit statsLimit_i
    ) {
        this.HP = HP;
        this.MP = MP;
        this.ATK = ATK;
        this.MAG = MAG;
        this.DEF = DEF;
        this.SPR = SPR;
        this.evasion = evasion;
        this.provocation = provocation;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getMAG() {
        return MAG;
    }

    public void setMAG(int MAG) {
        this.MAG = MAG;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getSPR() {
        return SPR;
    }

    public void setSPR(int SPR) {
        this.SPR = SPR;
    }

    public int getHP_i() {
        return HP_i;
    }

    public void setHP_i(int HP_i) {
        this.HP_i = HP_i;
    }

    public int getMP_i() {
        return MP_i;
    }

    public void setMP_i(int MP_i) {
        this.MP_i = MP_i;
    }

    public int getATK_i() {
        return ATK_i;
    }

    public void setATK_i(int ATK_i) {
        this.ATK_i = ATK_i;
    }

    public int getMAG_i() {
        return MAG_i;
    }

    public void setMAG_i(int MAG_i) {
        this.MAG_i = MAG_i;
    }

    public int getDEF_i() {
        return DEF_i;
    }

    public void setDEF_i(int DEF_i) {
        this.DEF_i = DEF_i;
    }

    public int getSPR_i() {
        return SPR_i;
    }

    public void setSPR_i(int SPR_i) {
        this.SPR_i = SPR_i;
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
}
