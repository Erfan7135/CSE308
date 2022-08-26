package item.burger_decorator;

import item.burger.Burger;

public class Slices extends BurgerDecorator {
    public Slices(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + " with Slices Cheese";
    }

    @Override
    public float price() {
        return burger.price() + 10.0f;
    }
}
