package item.drinks_decorator;

import item.burger.Burger;
import item.burger_decorator.BurgerDecorator;

public class CoffeeDecorator extends DrinksDecorator {

    public CoffeeDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + " with Cofee";
    }

    @Override
    public float price() {
        return burger.price() + 60.0f;
    }
}

