package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String color;
    private String material;
    private String type;


    public Instrument(String color, String material, String type, ) {
        this.color = color;
        this.material = material;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String getPlay(){
        return ""
    }
}
