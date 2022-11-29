package wagon;

public abstract class Wagon {
    private int mass = 0;
    private int length = 0;
    private String model = "";

    public Wagon(int mass, int length, String model) {
        this.mass = mass;
        this.length = length;
        this.model = model;
    }

    public Wagon() { }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
