package item.burger;

public class VeggiBurger extends Burger {

    @Override
    public String name() {
        return "Veggi Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
