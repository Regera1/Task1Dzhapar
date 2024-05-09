import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Drinks coffee = new HotDrinks(
                "Coffee",
                50,
                new ArrayList<String>(List.of("Hot water", "Ground coffee", "Sugar", "Milk")),
                100);
        Drinks regularTea = new HotDrinks(
                "Regular tea",
                50,
                new ArrayList<String>(List.of("Hot water", "Welding", "Sugar")),
                50);
        Drinks cocoa = new HotDrinks(
                "Cocoa",
                50,
                new ArrayList<String>(List.of("Hot water", "Cocoa powder", "Milk", "Sugar", "Vanilla")),
                50);
        BeverageVendingMachine machine001 = new BeverageVendingMachine(
                001,
                new HashMap<>
                (Map.of(
                        coffee,10,
                        regularTea,10,
                        cocoa,20)));


    }


}
