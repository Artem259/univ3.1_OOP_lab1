package wagon.locomotive;

import wagon.Wagon;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Locomotive that)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return maxCarryingMass == that.maxCarryingMass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCarryingMass);
    }
}
