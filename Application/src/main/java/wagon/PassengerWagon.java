package wagon;

public class PassengerWagon extends Wagon {
    private Integer passengersCapacity = 0;
    private Integer baggageCapacity = 0;
    private Integer passengers = 0;
    private Integer baggage = 0;
    private Integer comfortLevel = 0;

    public PassengerWagon(Integer passengersCapacity, Integer baggageCapacity, Integer comfortLevel) {
        this.passengersCapacity = passengersCapacity;
        this.baggageCapacity = baggageCapacity;
        this.comfortLevel = comfortLevel;
    }

    public PassengerWagon(Integer mass, Integer length, String model) {
        super(mass, length, model);
    }

    public Integer getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(Integer passengersCapacity) throws Exception {
        if (passengers > passengersCapacity) {
            throw new Exception();
        }
        this.passengersCapacity = passengersCapacity;
    }

    public Integer getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(Integer baggageCapacity) throws Exception {
        if (baggage > baggageCapacity) {
            throw new Exception();
        }
        this.baggageCapacity = baggageCapacity;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) throws Exception {
        if (passengers > passengersCapacity) {
            throw new Exception();
        }
        this.passengers = passengers;
    }

    public Integer getBaggage() {
        return baggage;
    }

    public void setBaggage(Integer baggage) throws Exception {
        if (baggage > baggageCapacity) {
            throw new Exception();
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
