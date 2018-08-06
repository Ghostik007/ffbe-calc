package Classes.Slots;

import Abstract_Classes.SlotAClass;
import Enumerations.BodyItemEnumeration;
import Enumerations.ItemEnumeration;
import Enumerations.SlotEnumeration;
import Interfaces.ItemInterface;

public class Slot_Body extends SlotAClass {

    public Slot_Body(boolean enabled, boolean filling, ItemInterface fillBy) {
        super(enabled, filling, fillBy);
        SLOTPOSITION = SlotEnumeration.BODY;
    }

    public boolean CheckItemType(ItemEnumeration item) {
        for( BodyItemEnumeration bexemp : BodyItemEnumeration.values() ){
            if( bexemp.equals(item) ) { return true; }
        }
        return false;
    }
}
