package train;

import org.junit.Before;
import org.junit.Test;
import wagon.PassengerWagon;
import wagon.Wagon;
import wagon.locomotive.Locomotive;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PassengerTrainTest {
    private PassengerTrain train;
    private List<Locomotive> locomotives;
    private List<PassengerWagon> wagons;

    @Before
    public void setUp() {
        train = new PassengerTrain();
        locomotives = new ArrayList<>();
        wagons = new ArrayList<>();
        Locomotive locomotive;
        PassengerWagon wagon;

        locomotive = new Locomotive(100);
        train.addLocomotive(locomotive);
        locomotives.add(locomotive);

        wagon = new PassengerWagon(10, 5, 1);
        wagon.setMass(12);
        wagon.setPassengers(30);
        wagon.setBaggage(20);
        train.addWagon(wagon);
        wagons.add(wagon);

        wagon = new PassengerWagon(10, 5, 3);
        wagon.setMass(11);
        wagon.setPassengers(25);
        wagon.setBaggage(17);
        train.addWagon(wagon);
        wagons.add(wagon);

        wagon = new PassengerWagon(10, 5, 1);
        wagon.setMass(16);
        wagon.setPassengers(27);
        wagon.setBaggage(19);
        train.addWagon(wagon);
        wagons.add(wagon);

        wagon = new PassengerWagon(10, 5, 4);
        wagon.setMass(17);
        wagon.setPassengers(34);
        wagon.setBaggage(28);
        train.addWagon(wagon);
        wagons.add(wagon);

        wagon = new PassengerWagon(10, 5, 2);
        wagon.setMass(16);
        train.addWagon(wagon);
        wagons.add(wagon);
    }

    @Test
    public void addLocomotive() {
        train.addLocomotive(locomotives.get(0));
        locomotives.add(locomotives.get(0));
        assertEquals(locomotives, train.getLocomotivesCopy());
    }

    @Test
    public void addWagon() {
        train.addWagon(wagons.get(0));
        wagons.add(wagons.get(0));
        assertEquals(wagons, train.getWagonsCopy());
    }

    @Test
    public void getLocomotive() {
        assertEquals(locomotives.get(0), train.getLocomotive(0));
    }

    @Test
    public void getWagon() {
        assertEquals(wagons.get(0), train.getWagon(0));
    }

    @Test
    public void deleteLocomotive() {
        train.deleteLocomotive(0);
        locomotives.remove(0);
        assertEquals(locomotives, train.getLocomotivesCopy());
    }

    @Test
    public void deleteWagon() {
        train.deleteWagon(0);
        wagons.remove(0);
        assertEquals(wagons, train.getWagonsCopy());
    }

    @Test
    public void getLocomotivesCopy() {
        assertEquals(locomotives, train.getLocomotivesCopy());
    }

    @Test
    public void getWagonsCopy() {
        assertEquals(wagons, train.getWagonsCopy());
    }

    @Test
    public void locomotivesSize() {
        assertEquals(locomotives.size(), train.locomotivesSize());
    }

    @Test
    public void wagonsSize() {
        assertEquals(wagons.size(), train.wagonsSize());
    }

    @Test
    public void totalPassengers() {
        assertEquals(116, train.totalPassengers());
    }

    @Test
    public void totalBaggage() {
        assertEquals(84, train.totalBaggage());
    }

    @Test
    public void sortedWagonsListByComfortLevel() {
        ArrayList<Wagon> list = new ArrayList<>();
        list.add(wagons.get(0));
        list.add(wagons.get(2));
        list.add(wagons.get(4));
        list.add(wagons.get(1));
        list.add(wagons.get(3));
        assertEquals(list, train.sortedWagonsListByComfortLevel());
    }

    @Test
    public void filteredWagonsListByPassengers() {
        ArrayList<Wagon> list = new ArrayList<>();
        list.add(wagons.get(0));
        list.add(wagons.get(2));
        assertEquals(list, train.filteredWagonsListByPassengers(27, 31));
    }

    @Test
    public void availableLocomotivesCarryingMass() {
        assertEquals(28, train.availableLocomotivesCarryingMass());
    }
}
