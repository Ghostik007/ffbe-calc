package Abstract_Classes;

public class ElementStatsAClass {
    protected int FIRE;
    protected int ICE;
    protected int WATER;
    protected int WIND;
    protected int EARTH;
    protected int LIGHT;
    protected int DARK;

    public ElementStatsAClass(int FIRE, int ICE, int WATER, int WIND, int EARTH, int LIGHT, int DARK) {
        this.FIRE = FIRE;
        this.ICE = ICE;
        this.WATER = WATER;
        this.WIND = WIND;
        this.EARTH = EARTH;
        this.LIGHT = LIGHT;
        this.DARK = DARK;
    }

    public int getFIRE() {
        return FIRE;
    }

    public void setFIRE(int FIRE) {
        this.FIRE = FIRE;
    }

    public int getICE() {
        return ICE;
    }

    public void setICE(int ICE) {
        this.ICE = ICE;
    }

    public int getWATER() {
        return WATER;
    }

    public void setWATER(int WATER) {
        this.WATER = WATER;
    }

    public int getWIND() {
        return WIND;
    }

    public void setWIND(int WIND) {
        this.WIND = WIND;
    }

    public int getEARTH() {
        return EARTH;
    }

    public void setEARTH(int EARTH) {
        this.EARTH = EARTH;
    }

    public int getLIGHT() {
        return LIGHT;
    }

    public void setLIGHT(int LIGHT) {
        this.LIGHT = LIGHT;
    }

    public int getDARK() {
        return DARK;
    }

    public void setDARK(int DARK) {
        this.DARK = DARK;
    }
}
