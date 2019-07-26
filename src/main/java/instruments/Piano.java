package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String color, String material, String type) {
        super(color, material, type);
        this.numberOfKeys = 88;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
