package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.ItemEnumeration;
import Enumerations.SlotEnumeration;
import Interfaces.ItemInterface;

public class Slot_Accessory_1 extends SlotAClass {
    public Slot_Accessory_1(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
        SLOTPOSITION = SlotEnumeration.ACCESSORY_1;
    }

    public boolean CheckItemType(ItemEnumeration item) {
        if( ItemEnumeration.ACCESSORIES == item ) { return true; }
        return false;
    }
}
