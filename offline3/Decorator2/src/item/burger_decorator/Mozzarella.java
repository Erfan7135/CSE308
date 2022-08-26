package item.burger_decorator;

import item.burger.Burger;

public class Mozzarella extends BurgerDecorator {

    public Mozzarella(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + " with Mozzarella Cheese";
    }

    @Override
    public float price() {
        return burger.price() + 15.0f;
    }
}

