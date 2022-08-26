package item.appetizer_decorator;

import item.burger.Burger;
import item.drinks_decorator.DrinksDecorator;

public class FrenchFriesDecorator extends AppetizerDecorator {

    public FrenchFriesDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + ", French Fries";
    }

    @Override
    public float price() {
        return burger.price() + 80.0f;
    }


}
