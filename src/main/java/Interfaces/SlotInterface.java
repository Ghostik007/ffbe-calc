package Interfaces;

import Enumerations.ItemEnumeration;
import Enumerations.SlotEnumeration;

public interface SlotInterface {
    boolean CheckItemType(ItemEnumeration item);
    boolean CheckAvailableSlot(SlotEnumeration slot);
}
