package wagon;

public class PassengerWagon extends Wagon {
    private Integer passengersCapacity;
    private Integer baggageCapacity;
    private Integer passengers;
    private Integer baggage;
    private Integer comfortLevel;

    public PassengerWagon(Integer passengersCapacity, Integer baggageCapacity, Integer comfortLevel) {
        this.passengersCapacity = passengersCapacity;
        this.baggageCapacity = baggageCapacity;
        this.passengers = 0;
        this.baggage = 0;
        this.comfortLevel = comfortLevel;
    }

    public PassengerWagon(Integer mass, Integer length, String model) {
        super(mass, length, model);
    }

    public Integer getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(Integer passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public Integer getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(Integer baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        if (passengers > passengersCapacity) {
            throw new IllegalArgumentException();
        }
        this.passengers = passengers;
    }

    public Integer getBaggage() {
        return baggage;
    }

    public void setBaggage(Integer baggage) {
        if (baggage > baggageCapacity) {
            throw new IllegalArgumentException();
        }
        this.baggage = baggage;
    }

    public Integer getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(Integer comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
}
