package Abstract_Classes.Stats;

public abstract class BaseStatsAClass {
    protected int HP;
    protected int MP;
    protected int ATK;
    protected int MAG;
    protected int DEF;
    protected int SPR;

    public BaseStatsAClass(int HP, int MP, int ATK, int MAG, int DEF, int SPR) {
        this.HP = HP;
        this.MP = MP;
        this.ATK = ATK;
        this.MAG = MAG;
        this.DEF = DEF;
        this.SPR = SPR;
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
}
