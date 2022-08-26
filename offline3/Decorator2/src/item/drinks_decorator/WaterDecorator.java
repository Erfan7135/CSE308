package item.drinks_decorator;

import item.burger.Burger;
import item.burger_decorator.BurgerDecorator;

public class WaterDecorator extends DrinksDecorator {

    public WaterDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + " with Water";
    }

    @Override
    public float price() {
        return burger.price() + 20.0f;
    }


}
