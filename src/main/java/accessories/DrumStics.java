package accessories;

import behaviours.ISell;

public class DrumStics implements ISell {

    private int type;
    private int price;

    public DrumStics (int type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void calculateMarkUp() {

    }
}
