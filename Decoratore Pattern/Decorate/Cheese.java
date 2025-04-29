package Decorate;

import Component.Pizza;

public class Cheese extends Decorator {
    public Cheese(Pizza pizza) {
        super( pizza);
    }
    public int getPrice() {
        return pizza.getPrice()+50;
    }


    public String getDescription()
    {
        return pizza.getDescription()+", cheese added";
    }
}
