package wagon.locomotive;

import wagon.Wagon;

public class Locomotive extends Wagon {
    private int maxCarryingMass = 0;

    public Locomotive(int maxCarryingMass) {
        this.maxCarryingMass = maxCarryingMass;
    }

    public Locomotive(int mass, int length, String model) {
        super(mass, length, model);
    }

    public int getMaxCarryingMass() {
        return maxCarryingMass;
    }

    public void setMaxCarryingMass(int maxCarryingMass) {
        this.maxCarryingMass = maxCarryingMass;
    }
}
