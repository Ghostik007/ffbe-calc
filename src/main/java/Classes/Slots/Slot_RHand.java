package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.ItemEnumeration;
import Enumerations.ShieldItemEnumeration;
import Enumerations.SlotEnumeration;
import Enumerations.WeaponEnumeration;
import Interfaces.ItemInterface;

public class Slot_RHand extends SlotAClass {

    public Slot_RHand(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
        SLOTPOSITION = SlotEnumeration.RIGHT_HAND;
    }

    public boolean CheckItemType(ItemEnumeration item) {

        for( WeaponEnumeration wexemp : WeaponEnumeration.values() ){
                if( wexemp.equals(item) ) { return true; }
        }

        for( ShieldItemEnumeration sexemp : ShieldItemEnumeration.values() ){
            if( sexemp.equals(item) ) { return true; }
        }

        return false;
    }


}
