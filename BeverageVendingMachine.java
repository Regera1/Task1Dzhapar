import java.util.*;

public class BeverageVendingMachine {
    private int machineNumber;


    private Map<Drinks,Integer> listOfDrinks;

    public BeverageVendingMachine(int machineNumber, Map<Drinks, Integer>listOfDrinks) {
        this.machineNumber = machineNumber;
        this.listOfDrinks = listOfDrinks;

    }

    @Override
    public String toString() {
        return machineNumber +" " +listOfDrinks;
    }

}
