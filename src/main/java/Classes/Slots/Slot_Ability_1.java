package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.ItemEnumeration;
import Enumerations.SlotEnumeration;
import Interfaces.ItemInterface;

public class Slot_Ability_1 extends SlotAClass {

    public Slot_Ability_1(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
        SLOTPOSITION = SlotEnumeration.ABILITY_1;
    }

    public boolean CheckItemType(ItemEnumeration item) {
        if( ItemEnumeration.ABILITY == item ) { return true; }
        return false;
    }
}
