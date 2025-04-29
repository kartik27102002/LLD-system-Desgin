package Decorate;

import Component.Pizza;

public class Olives extends Decorator {
    public Olives(Pizza pizza) {
        super(pizza);

    }

    public int getPrice() {
        return pizza.getPrice()+40;
    }


    public String getDescription()
    {
        return pizza.getDescription()+", olives added";
    }
}
