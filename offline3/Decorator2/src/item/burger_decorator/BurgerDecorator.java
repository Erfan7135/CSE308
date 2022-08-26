package item.burger_decorator;

import item.burger.Burger;

public abstract class BurgerDecorator extends Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    protected BurgerDecorator() {
    }
}
