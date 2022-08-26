package item.drinks_decorator;

import item.burger.Burger;
import item.burger_decorator.BurgerDecorator;

public abstract class DrinksDecorator extends Burger {

    protected Burger burger;

    public DrinksDecorator(Burger burger) {
        this.burger = burger;
    }

    protected DrinksDecorator() {
    }
}
