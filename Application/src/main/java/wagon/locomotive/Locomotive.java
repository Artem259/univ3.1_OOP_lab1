package wagon.locomotive;

import wagon.Wagon;

public class Locomotive extends Wagon {
    private Integer maxCarryingMass = 0;

    public Locomotive(Integer maxCarryingMass) {
        this.maxCarryingMass = maxCarryingMass;
    }

    public Locomotive(Integer mass, Integer length, String model) {
        super(mass, length, model);
    }

    public Integer getMaxCarryingMass() {
        return maxCarryingMass;
    }

    public void setMaxCarryingMass(Integer maxCarryingMass) {
        this.maxCarryingMass = maxCarryingMass;
    }
}
