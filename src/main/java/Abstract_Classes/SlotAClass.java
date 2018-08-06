package Abstract_Classes;

import Enumerations.SlotEnumeration;
import Interfaces.ItemInterface;
import Interfaces.SlotInterface;

public abstract class SlotAClass implements SlotInterface {
    protected SlotEnumeration SLOTPOSITION;
    protected boolean enabled;
    protected boolean filling;
    protected ItemInterface fillBy;

    public SlotAClass(boolean enabled, boolean filling, ItemInterface fillBy) {
        this.enabled = enabled;
        this.filling = filling;
        this.fillBy = fillBy;
    }

    public boolean CheckAvailableSlot(SlotEnumeration slot) {
        if ( slot.equals( SLOTPOSITION ) ) { return true; }
        return false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public ItemInterface getFillBy() {
        return fillBy;
    }

    public void setFillBy(ItemInterface fillBy) {
        this.fillBy = fillBy;
    }

}
