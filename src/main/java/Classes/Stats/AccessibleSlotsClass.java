package Classes.Stats;

public class AccessibleSlotsClass {
    protected boolean right_hand;
    protected boolean left_hand;
    protected boolean head;
    protected boolean body;
    protected boolean accessory_1;
    protected boolean accessory_2;
    protected boolean ability_1;
    protected boolean ability_2;
    protected boolean ability_3;
    protected boolean ability_4;

    public AccessibleSlotsClass(boolean right_hand,
                                boolean left_hand,
                                boolean head,
                                boolean body,
                                boolean accessory_1,
                                boolean accessory_2,
                                boolean ability_1,
                                boolean ability_2,
                                boolean ability_3,
                                boolean ability_4) {
        this.right_hand = right_hand;
        this.left_hand = left_hand;
        this.head = head;
        this.body = body;
        this.accessory_1 = accessory_1;
        this.accessory_2 = accessory_2;
        this.ability_1 = ability_1;
        this.ability_2 = ability_2;
        this.ability_3 = ability_3;
        this.ability_4 = ability_4;
    }

    public boolean isRight_hand() {
        return right_hand;
    }

    public void setRight_hand(boolean right_hand) {
        this.right_hand = right_hand;
    }

    public boolean isLeft_hand() {
        return left_hand;
    }

    public void setLeft_hand(boolean left_hand) {
        this.left_hand = left_hand;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public boolean isBody() {
        return body;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public boolean isAccessory_1() {
        return accessory_1;
    }

    public void setAccessory_1(boolean accessory_1) {
        this.accessory_1 = accessory_1;
    }

    public boolean isAccessory_2() {
        return accessory_2;
    }

    public void setAccessory_2(boolean accessory_2) {
        this.accessory_2 = accessory_2;
    }

    public boolean isAbility_1() {
        return ability_1;
    }

    public void setAbility_1(boolean ability_1) {
        this.ability_1 = ability_1;
    }

    public boolean isAbility_2() {
        return ability_2;
    }

    public void setAbility_2(boolean ability_2) {
        this.ability_2 = ability_2;
    }

    public boolean isAbility_3() {
        return ability_3;
    }

    public void setAbility_3(boolean ability_3) {
        this.ability_3 = ability_3;
    }

    public boolean isAbility_4() {
        return ability_4;
    }

    public void setAbility_4(boolean ability_4) {
        this.ability_4 = ability_4;
    }
}
