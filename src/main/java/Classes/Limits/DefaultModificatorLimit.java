package Classes.Limits;

public class DefaultModificatorLimit {
    protected int DefaultModificatorStart;
    protected int DefaultModificatorEnd;

    public DefaultModificatorLimit(int defaultModificatorStart, int defaultModificatorEnd) {
        DefaultModificatorStart = defaultModificatorStart;
        DefaultModificatorEnd = defaultModificatorEnd;
    }

    public int getDefaultModificatorStart() {
        return DefaultModificatorStart;
    }

    public void setDefaultModificatorStart(int defaultModificatorStart) {
        DefaultModificatorStart = defaultModificatorStart;
    }

    public int getDefaultModificatorEnd() {
        return DefaultModificatorEnd;
    }

    public void setDefaultModificatorEnd(int defaultModificatorEnd) {
        DefaultModificatorEnd = defaultModificatorEnd;
    }
}
