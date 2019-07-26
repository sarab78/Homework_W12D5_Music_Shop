package accessories;

public class GuitarStrings extends Accessory{

    public GuitarStrings(String name, int sellingPrice, int buyingPrice) {
        super(name, sellingPrice, buyingPrice);
    }

    public int calculateMarkUp() {
        return 0;
    }
}
