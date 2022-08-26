package item.appetizer_decorator;


import item.burger.Burger;
import item.drinks_decorator.DrinksDecorator;

public abstract class AppetizerDecorator extends Burger {
    protected Burger burger;

    public AppetizerDecorator(Burger burger) {
        this.burger = burger;
    }

    protected AppetizerDecorator() {
    }

}
