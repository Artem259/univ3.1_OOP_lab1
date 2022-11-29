package train;

import wagon.PassengerWagon;
import wagon.locomotive.Locomotive;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PassengerTrain {
    private final List<Locomotive> locomotives = new ArrayList<>();
    private final List<PassengerWagon> wagons = new ArrayList<>();

    public PassengerTrain() { }

    public void addLocomotive(Locomotive locomotive) {
        locomotives.add(locomotive);
    }

    public void addWagon(PassengerWagon wagon) {
        wagons.add(wagon);
    }

    public Locomotive getLocomotive(int index) {
        return locomotives.get(index);
    }

    public PassengerWagon getWagon(int index) {
        return wagons.get(index);
    }

    public void deleteLocomotive(int index) {
        locomotives.remove(index);
    }

    public void deleteWagon(int index) {
        wagons.remove(index);
    }

    public List<Locomotive> getLocomotivesCopy() {
        return new ArrayList<>(locomotives);
    }

    public List<PassengerWagon> getWagonsCopy() {
        return new ArrayList<>(wagons);
    }

    public int locomotivesSize() {
        return locomotives.size();
    }

    public int wagonsSize() {
        return wagons.size();
    }

    public int totalPassengers() {
        return wagons.stream().mapToInt(PassengerWagon::getPassengers).sum();
    }

    public int totalBaggage() {
        return wagons.stream().mapToInt(PassengerWagon::getBaggage).sum();
    }

    /** @return a copy of the wagons list, sorted in ascending order */
    public List<PassengerWagon> sortedWagonsListByComfortLevel() {
        return wagons.stream().sorted(Comparator.comparing(PassengerWagon::getComfortLevel))
                .collect(Collectors.toList());
    }

    public List<PassengerWagon> filteredWagonsListByPassengers(int from, int to) {
        if (to < from) {
            throw new IllegalArgumentException("to < from");
        }
        return wagons.stream().filter(o -> (o.getPassengers() >= from && o.getPassengers() <= to))
                .collect(Collectors.toList());
    }

    public int availableLocomotivesCarryingMass() {
        int resMass = 0;
        resMass += locomotives.stream().mapToInt(Locomotive::getMaxCarryingMass).sum();
        resMass -= wagons.stream().mapToInt(PassengerWagon::getMass).sum();
        return resMass;
    }
}
