package main;

import train.PassengerTrain;
import wagon.PassengerWagon;
import wagon.locomotive.Locomotive;

import java.util.List;

public class Main {
    private final PassengerTrain train;

    private Main() {
        this.train = new PassengerTrain();
    }

    private List<Integer> comfortLevelsList(List<PassengerWagon> wagons) {
        return wagons.stream().mapToInt(PassengerWagon::getComfortLevel).boxed().toList();
    }

    private List<Integer> passengersList(List<PassengerWagon> wagons) {
        return wagons.stream().mapToInt(PassengerWagon::getPassengers).boxed().toList();
    }

    private void fillTrain() {
        Locomotive locomotive;
        PassengerWagon wagon;

        locomotive = new Locomotive(100);
        train.addLocomotive(locomotive);

        wagon = new PassengerWagon(10, 5, 1);
        wagon.setMass(10);
        wagon.setPassengers(30);
        wagon.setBaggage(20);
        train.addWagon(wagon);

        wagon = new PassengerWagon(10, 5, 3);
        wagon.setMass(10);
        wagon.setPassengers(25);
        wagon.setBaggage(17);
        train.addWagon(wagon);

        wagon = new PassengerWagon(10, 5, 1);
        wagon.setMass(10);
        wagon.setPassengers(27);
        wagon.setBaggage(19);
        train.addWagon(wagon);

        wagon = new PassengerWagon(10, 5, 4);
        wagon.setMass(10);
        wagon.setPassengers(34);
        wagon.setBaggage(28);
        train.addWagon(wagon);

        wagon = new PassengerWagon(10, 5, 2);
        wagon.setMass(10);
        train.addWagon(wagon);
    }

    public void start() {
        fillTrain();
        List<Integer> integerList;
        System.out.println();

        System.out.println("                     Passengers: " + train.totalPassengers());
        System.out.println("                        Baggage: " + train.totalBaggage());
        System.out.println();

        integerList = comfortLevelsList(train.getWagonsCopy());
        System.out.println("   Unsorted comfort levels list: " + integerList);
        integerList = comfortLevelsList(train.sortedWagonsListByComfortLevel());
        System.out.println("     Sorted comfort levels list: " + integerList);
        System.out.println();

        int from = 27;
        int to = 31;
        integerList = passengersList(train.getWagonsCopy());
        System.out.println("           Full passengers list: " + integerList);
        integerList = passengersList(train.filteredWagonsListByPassengers(from, to));
        System.out.println("Passengers list in range " + from + ".." + to + ": " + integerList);
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
