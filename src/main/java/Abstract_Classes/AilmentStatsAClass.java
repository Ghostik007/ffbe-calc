package Abstract_Classes;

public class AilmentStatsAClass {
    protected int poison;
    protected int blind;
    protected int sleep;
    protected int silence;
    protected int paralyze;
    protected int confuse;
    protected int disease;
    protected int paralize;
    protected int stop;
    protected int charm;

    public AilmentStatsAClass(int poison, int blind, int sleep, int silence, int paralyze, int confuse, int disease, int paralize, int stop, int charm) {
        this.poison = poison;
        this.blind = blind;
        this.sleep = sleep;
        this.silence = silence;
        this.paralyze = paralyze;
        this.confuse = confuse;
        this.disease = disease;
        this.paralize = paralize;
        this.stop = stop;
        this.charm = charm;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    public int getBlind() {
        return blind;
    }

    public void setBlind(int blind) {
        this.blind = blind;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getSilence() {
        return silence;
    }

    public void setSilence(int silence) {
        this.silence = silence;
    }

    public int getParalyze() {
        return paralyze;
    }

    public void setParalyze(int paralyze) {
        this.paralyze = paralyze;
    }

    public int getConfuse() {
        return confuse;
    }

    public void setConfuse(int confuse) {
        this.confuse = confuse;
    }

    public int getDisease() {
        return disease;
    }

    public void setDisease(int disease) {
        this.disease = disease;
    }

    public int getParalize() {
        return paralize;
    }

    public void setParalize(int paralize) {
        this.paralize = paralize;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }
}
