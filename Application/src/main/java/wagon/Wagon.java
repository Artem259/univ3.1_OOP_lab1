package wagon;

public abstract class Wagon {
    private Integer mass;
    private Integer length;
    private String model;

    public Wagon(Integer mass, Integer length, String model) {
        this.mass = mass;
        this.length = length;
        this.model = model;
    }

    public Wagon() {
        this.mass = null;
        this.length = null;
        this.model = null;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
