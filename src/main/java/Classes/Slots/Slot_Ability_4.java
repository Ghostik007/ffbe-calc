package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.ItemEnumeration;
import Interfaces.ItemInterface;

public class Slot_Ability_4 extends SlotAClass {

    public Slot_Ability_4(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
    }

    public boolean CheckItemType(ItemEnumeration item) {
        if( ItemEnumeration.ABILITY == item ) { return true; }
        return false;
    }
}
