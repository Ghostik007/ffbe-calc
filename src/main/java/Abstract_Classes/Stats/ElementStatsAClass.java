package Abstract_Classes.Stats;

public abstract class ElementStatsAClass {
    protected int fire;
    protected int ice;
    protected int lightning;
    protected int water;
    protected int wind;
    protected int earth;
    protected int light;
    protected int dark;

    public ElementStatsAClass(int fire, int ice, int lightning, int water, int wind, int earth, int light, int dark) {
        this.fire = fire;
        this.ice = ice;
        this.lightning = lightning;
        this.water = water;
        this.wind = wind;
        this.earth = earth;
        this.light = light;
        this.dark = dark;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    public int getLightning() {
        return lightning;
    }

    public void setLightning(int lightning) {
        this.lightning = lightning;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public int getEarth() {
        return earth;
    }

    public void setEarth(int earth) {
        this.earth = earth;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getDark() {
        return dark;
    }

    public void setDark(int dark) {
        this.dark = dark;
    }
}
