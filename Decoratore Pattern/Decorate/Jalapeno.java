package Decorate;

import Component.Pizza;

public class Jalapeno extends Decorator {
    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    public int getPrice() {
        return pizza.getPrice()+30;
    }


    public String getDescription()
    {
        return pizza.getDescription()+", jalapeno added";
    }

}
