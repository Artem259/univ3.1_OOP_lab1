package wagon;

public class CargoWagon extends Wagon {
    private Integer cargoMassCapacity;
    private Integer cargoVolumeCapacity;
    private Integer cargoMass;
    private Integer cargoVolume;

    public CargoWagon(Integer cargoMassCapacity, Integer cargoVolumeCapacity) {
        this.cargoMassCapacity = cargoMassCapacity;
        this.cargoVolumeCapacity = cargoVolumeCapacity;
        this.cargoMass = 0;
        this.cargoVolume = 0;
    }

    public CargoWagon(Integer mass, Integer length, String model) {
        super(mass, length, model);
    }

    public Integer getCargoMassCapacity() {
        return cargoMassCapacity;
    }

    public void setCargoMassCapacity(Integer cargoMassCapacity) {
        this.cargoMassCapacity = cargoMassCapacity;
    }

    public Integer getCargoVolumeCapacity() {
        return cargoVolumeCapacity;
    }

    public void setCargoVolumeCapacity(Integer cargoVolumeCapacity) {
        this.cargoVolumeCapacity = cargoVolumeCapacity;
    }

    public Integer getCargoMass() {
        return cargoMass;
    }

    public void setCargoMass(Integer cargoMass) {
        if (cargoMass > cargoMassCapacity) {
            throw new IllegalArgumentException();
        }
        this.cargoMass = cargoMass;
    }

    public Integer getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(Integer cargoVolume) {
        if (cargoVolume > cargoVolumeCapacity) {
            throw new IllegalArgumentException();
        }
        this.cargoVolume = cargoVolume;
    }
}
