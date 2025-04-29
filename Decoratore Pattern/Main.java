


import Component.Farmhouse;
import Component.Margherita;
import Component.Pizza;
import Decorate.Cheese;
import Decorate.Jalapeno;
import Decorate.Olives;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Pizza pizza = new Farmhouse();
     pizza= new Cheese(new Jalapeno(pizza));
     System.out.println(pizza.getDescription());
      System.out.println(pizza.getPrice());

      Pizza pizz= new Margherita();
      pizz= new Cheese(new Olives(pizz));
      System.out.println(pizz.getDescription());
      System.out.println(pizz.getPrice());









        }

}