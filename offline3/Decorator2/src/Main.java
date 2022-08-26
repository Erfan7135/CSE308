
import item.appetizer_decorator.FrenchFriesDecorator;
import item.appetizer_decorator.OnionRingsDecorator;
import item.burger.BeefBurger;
import item.burger.Burger;
import item.burger.ChickenBurger;
import item.burger.VeggiBurger;
import item.burger_decorator.Mozzarella;
import item.burger_decorator.Slices;
import item.drinks_decorator.*;
import meal.Meal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n = 1;

        Scanner scan = new Scanner(System.in);
        Meal meal = new Meal();

        while(true){
            switch (n){
                case 0:
                    System.out.println("Order Cancelled");
                    System.out.println("Thank you for visiting the Burger Shop!");
                    n=1;
                    meal = new Meal();
                    break;
                case 1:
                    System.out.println("==================================");
                    System.out.println("Welcome to the Burger Shop!");
                    System.out.println("Please select a burger type:");
                    System.out.println("1. Veggi Burger");
                    System.out.println("2. Beef Burger");
                    System.out.println("3. Chicken Burger");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n == 1) {
                        System.out.println("You have selected a Veggi Burger!");
                        //meal.setItem(new VeggiBurger());
                        n=5;
                    }
                    else if(n == 2) {
                        System.out.println("You have selected a Beef Burger!");
                        //meal.setItem(new BeefBurger());
                        n=2;
                    }
                    else if(n == 3) {
                        System.out.println("You have selected a Chicken Burger!");
                        //meal.setItem(new ChickenBurger());
                        n=2;
                    } else if (n==0) {
                    } else{
                        System.out.println("Invalid Input");
                        n=1;
                    }
                    break;

                case 2:
                    System.out.println("Please select a drink type:");
                    System.out.println("1. Coffee");
                    System.out.println("2. Coke");
                    System.out.println("3. Water");
                    System.out.println("4. None");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n==1){
                        System.out.println("You have selected a Coffee!");
                        //Item item = (Item) meal.getItems();
                        //BurgerDecorator item = (Burger) meal.getItems();
                        meal.setItem(new CoffeeDecorator((Burger)meal.getItems()));
                        n=3;
                    }
                    else if(n==2){
                        System.out.println("You have selected a Coke!");
                        //Item item = (Item) meal.getItems();
                        Burger item = (Burger) meal.getItems();
                        meal.setItem(new CokeDecorator((Burger)item));
                        n=3;
                    }
                    else if(n==3){
                        System.out.println("You have selected a Water!");
                        //Item item = (Item) meal.getItems();
                        Burger item = (Burger) meal.getItems();
                        meal.setItem(new WaterDecorator(item));
                        n=3;
                    }
                    else if(n==4){
                        //System.out.println("You have selected None!");
                        n=3;
                    } else if (n==0) {
                    } else {
                        System.out.println("Invalid Input");
                        n=2;
                    }
                    break;

                case 3:
                    System.out.println("Please select an Appetizer:");
                    System.out.println("1. French Fries");
                    System.out.println("2. Onion Rings");
                    System.out.println("3. None");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n==1){
                        System.out.println("You have selected French Fries!");
                        //Item item = (Item) meal.getItems();
                        Burger item = (Burger) meal.getItems();
                        meal.setItem(new FrenchFriesDecorator(item));
                        n=4;
                    }
                    else if(n==2){
                        System.out.println("You have selected Onion Rings!");
                        //Item item = (Item) meal.getItems();
                        Burger item = (Burger) meal.getItems();
                        meal.setItem(new OnionRingsDecorator(item));
                        n=4;
                    }
                    else if(n==3){
                        //System.out.println("You have selected None!");
                        n=4;
                    } else if (n==0) {
                    } else {
                        System.out.println("Invalid Input");
                        n=3;
                    }
                    break;

                case 4:
                    System.out.println("Thank you for Ordering!");
                    meal.showItems();
                    System.out.println("----------------------------\n");
                    meal=new Meal();
                    n=1;
                    break;

                case 5:
                    System.out.println("Please select cheese type:");
                    System.out.println("1. Mozzarella");
                    System.out.println("2. Slices");
                    System.out.println("3. None");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n==1){
                        System.out.println("You have selected Mozzarella!");
                        //Item item = (Item) meal.getItems();
                        //Burger burger = (Burger) meal.getItems();
                        meal.setItem(new Mozzarella(new VeggiBurger()));
                        n=2;
                    }
                    else if(n==2){
                        System.out.println("You have selected Slices!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new Slices(new VeggiBurger()));
                        n=2;
                    }
                    else if(n==3){
                        //System.out.println("You have selected None!");
                        meal.setItem(new VeggiBurger());
                        n=2;
                    } else if (n==0) {
                    } else {
                        System.out.println("Invalid Input");
                        n=5;
                    }
                    break;

                case 6:
                    System.out.println("Please select cheese type:");
                    System.out.println("1. Mozzarella");
                    System.out.println("2. Slices");
                    System.out.println("3. None");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n==1){
                        System.out.println("You have selected Mozzarella!");
                        meal.setItem(new Mozzarella(new BeefBurger()));
                        n=2;
                    }
                    else if(n==2){
                        System.out.println("You have selected Slices!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new Slices(new BeefBurger()));
                        n=2;
                    }
                    else if(n==3){
                        //System.out.println("You have selected None!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new BeefBurger());
                        n=2;
                    } else if (n==0) {
                    } else {
                        System.out.println("Invalid Input");
                        n=5;
                    }
                    break;

                case 7:
                    System.out.println("Please select cheese type:");
                    System.out.println("1. Mozzarella");
                    System.out.println("2. Slices");
                    System.out.println("3. None");
                    System.out.println("0. Exit");
                    n = scan.nextInt();
                    if(n==1){
                        System.out.println("You have selected Mozzarella!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new Mozzarella(new ChickenBurger()));
                        n=2;
                    }
                    else if(n==2){
                        System.out.println("You have selected Slices!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new Slices(new ChickenBurger()));
                        n=2;
                    }
                    else if(n==3){
                        //System.out.println("You have selected None!");
                        //Item item = (Item) meal.getItems();
                        meal.setItem(new ChickenBurger());
                        n=2;
                    } else if (n==0) {
                    } else {
                        System.out.println("Invalid Input");
                        n=5;
                    }
                    break;

            }
        }

    }
}
