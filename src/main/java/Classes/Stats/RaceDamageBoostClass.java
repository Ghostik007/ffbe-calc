package Classes.Stats;

public class RaceDamageBoostClass {
    protected int aquatic;
    protected int beast;
    protected int bird;
    protected int bug;
    protected int demon;
    protected int dragon;
    protected int human;
    protected int machine;
    protected int plant;
    protected int undead;
    protected int stone;
    protected int spirit;

    public RaceDamageBoostClass(int aquatic,
                                int beast,
                                int bird,
                                int bug,
                                int demon,
                                int dragon,
                                int human,
                                int machine,
                                int plant,
                                int undead,
                                int stone,
                                int spirit) {
        this.aquatic = aquatic;
        this.beast = beast;
        this.bird = bird;
        this.bug = bug;
        this.demon = demon;
        this.dragon = dragon;
        this.human = human;
        this.machine = machine;
        this.plant = plant;
        this.undead = undead;
        this.stone = stone;
        this.spirit = spirit;
    }

    public int getAquatic() {
        return aquatic;
    }

    public void setAquatic(int aquatic) {
        this.aquatic = aquatic;
    }

    public int getBeast() {
        return beast;
    }

    public void setBeast(int beast) {
        this.beast = beast;
    }

    public int getBird() {
        return bird;
    }

    public void setBird(int bird) {
        this.bird = bird;
    }

    public int getBug() {
        return bug;
    }

    public void setBug(int bug) {
        this.bug = bug;
    }

    public int getDemon() {
        return demon;
    }

    public void setDemon(int demon) {
        this.demon = demon;
    }

    public int getDragon() {
        return dragon;
    }

    public void setDragon(int dragon) {
        this.dragon = dragon;
    }

    public int getHuman() {
        return human;
    }

    public void setHuman(int human) {
        this.human = human;
    }

    public int getMachine() {
        return machine;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public int getPlant() {
        return plant;
    }

    public void setPlant(int plant) {
        this.plant = plant;
    }

    public int getUndead() {
        return undead;
    }

    public void setUndead(int undead) {
        this.undead = undead;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }
}
