package item.appetizer_decorator;

import item.burger.Burger;
import item.drinks_decorator.DrinksDecorator;

public class OnionRingsDecorator extends AppetizerDecorator {

    public OnionRingsDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return burger.name() + ", Onion Rings";
    }

    @Override
    public float price() {
        return burger.price() + 65.0f;
    }
}
