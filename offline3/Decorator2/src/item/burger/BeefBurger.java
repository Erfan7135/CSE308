package item.burger;

public class BeefBurger extends Burger {

    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public float price() {
        return 80.0f;
    }

}
