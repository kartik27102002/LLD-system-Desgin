package Decorate;

import Component.Pizza;

public abstract class Decorator  implements Pizza {
    protected Pizza pizza;
    public Decorator(Pizza pizza) {
        this.pizza=pizza;
    }
}
