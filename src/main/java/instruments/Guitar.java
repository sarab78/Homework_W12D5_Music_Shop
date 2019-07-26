package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String color, String material, String type) {
        super(color, material, type);
        this.numberOfStrings = 6;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


}
