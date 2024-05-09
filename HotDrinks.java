import java.util.Arrays;
import java.util.List;

public class HotDrinks extends Drinks {
    private double temperature;

    public HotDrinks(String name, double volume, List<String> ingridients, double temperature) {
        super(name, volume, ingridients);
        this.temperature = temperature;
    }

    @Override
    public void getInfo(Drinks drink) {
        super.getInfo(drink);
        getTemperature();
    }

    private double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return name + " " + volume + " " + ingridients;

    }
}
