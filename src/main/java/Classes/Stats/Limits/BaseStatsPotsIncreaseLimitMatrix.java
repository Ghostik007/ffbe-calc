package Classes.Stats.Limits;

public class BaseStatsPotsIncreaseLimitMatrix {
    protected int HP;
    protected int MP;
    protected int ATK;
    protected int MAG;
    protected int DEF;
    protected int SPR;


    public BaseStatsPotsIncreaseLimitMatrix(int HP,
                                            int MP,
                                            int ATK,
                                            int MAG,
                                            int DEF,
                                            int SPR) {
        this.HP = HP;
        this.MP = MP;
        this.ATK = ATK;
        this.MAG = MAG;
        this.DEF = DEF;
        this.SPR = SPR;
    }
}
