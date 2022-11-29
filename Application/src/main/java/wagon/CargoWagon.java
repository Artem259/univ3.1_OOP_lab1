package wagon;

public class CargoWagon extends Wagon {
    private int cargoMassCapacity = 0;
    private int cargoVolumeCapacity = 0;
    private int cargoMass = 0;
    private int cargoVolume = 0;

    public CargoWagon(int cargoMassCapacity, int cargoVolumeCapacity) {
        this.cargoMassCapacity = cargoMassCapacity;
        this.cargoVolumeCapacity = cargoVolumeCapacity;
    }

    public CargoWagon(int mass, int length, String model) {
        super(mass, length, model);
    }

    public int getCargoMassCapacity() {
        return cargoMassCapacity;
    }

    public void setCargoMassCapacity(int cargoMassCapacity) {
        this.cargoMassCapacity = cargoMassCapacity;
    }

    public int getCargoVolumeCapacity() {
        return cargoVolumeCapacity;
    }

    public void setCargoVolumeCapacity(int cargoVolumeCapacity) {
        this.cargoVolumeCapacity = cargoVolumeCapacity;
    }

    public int getCargoMass() {
        return cargoMass;
    }

    public void setCargoMass(int cargoMass) {
        this.cargoMass = cargoMass;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public int availableCargoMass() {
        return (cargoMassCapacity - cargoMass);
    }

    public int availableCargoVolume() {
        return (cargoVolumeCapacity - cargoVolume);
    }

    public boolean isOverloadedByMass() {
        return (availableCargoMass() < 0);
    }

    public boolean isOverloadedByVolume() {
        return (availableCargoVolume() < 0);
    }
}
