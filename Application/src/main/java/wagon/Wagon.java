package wagon;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Wagon wagon)) {
            return false;
        }
        return mass == wagon.mass && length == wagon.length && Objects.equals(model, wagon.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, length, model);
    }
}
