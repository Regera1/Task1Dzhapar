import java.util.List;
import java.util.Objects;

public class Drinks {
    protected String name;
    protected double volume;
    protected List<String> ingridients;

    public Drinks(String name, double volume, List<String> ingridients) {
        this.name = name;
        this.volume = volume;
        this.ingridients = ingridients;
    }

    private String getName() {
        return name;
    }

    private double getVolume() {
        return volume;
    }

    private List<String> getIngridients() {
        return ingridients;
    }
    public void getInfo(Drinks drink){
        drink.getName();
        drink.getVolume();
        drink.getIngridients();

    }
}
