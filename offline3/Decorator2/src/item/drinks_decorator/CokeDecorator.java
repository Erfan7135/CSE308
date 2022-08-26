package item.drinks_decorator;

import item.burger.Burger;
import item.burger_decorator.BurgerDecorator;

public class CokeDecorator extends DrinksDecorator {

    public CokeDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + " with Coke";
    }

    @Override
    public float price() {
        return burger.price() + 35.0f;
    }

}
