package wagon;

public class PassengerWagon extends Wagon {
    private int passengersCapacity = 0;
    private int baggageCapacity = 0;
    private int passengers = 0;
    private int baggage = 0;
    private int comfortLevel = 0;

    public PassengerWagon(int passengersCapacity, int baggageCapacity, int comfortLevel) {
        this.passengersCapacity = passengersCapacity;
        this.baggageCapacity = baggageCapacity;
        this.comfortLevel = comfortLevel;
    }

    public PassengerWagon(int mass, int length, String model) {
        super(mass, length, model);
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public int availablePassengers() {
        return (passengersCapacity - passengers);
    }

    public int availableBaggage() {
        return (baggageCapacity - baggage);
    }

    public boolean isOverloadedByPassengers() {
        return (availablePassengers() < 0);
    }

    public boolean isOverloadedByBaggage() {
        return (availableBaggage() < 0);
    }
}
