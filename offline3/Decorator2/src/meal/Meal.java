package meal;

import item.Item;

import java.util.List;

public class Meal {

    //List<Item> items= new java.util.ArrayList<Item>();

    public static Item items;

    public Meal() {
        items = new Item() {
            @Override
            public String name() {
                return null;
            }

            @Override
            public float price() {
                return 0;
            }
        };
    }

    public void setItem(Item item) {
        items=item;
    }

    float getCost() {
        float cost = 0.0f;
        cost = items.price();
        return cost;
    }

    public void showItems() {

        System.out.println("Item : " + items.name()  + " , Price : " + items.price());
        System.out.println("Total Cost : " + getCost());
    }

    public Item getItems() {
        return items;
    }

}
