package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.HeadItemEnumeration;
import Enumerations.ItemEnumeration;
import Enumerations.SlotEnumeration;
import Enumerations.WeaponEnumeration;
import Interfaces.ItemInterface;

public class Slot_Head extends SlotAClass {

    public Slot_Head(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
        SLOTPOSITION = SlotEnumeration.HEAD;
    }

    public boolean CheckItemType(ItemEnumeration item) {

        for( HeadItemEnumeration hexemp : HeadItemEnumeration.values() ){
            if( hexemp.equals(item) ) { return true; }
        }

        return false;
    }
}
