package services;

import model.Order;

public class orderRepo {
    public void save(Order order) {
        System.out.println("-- DATA SAVED IN DB ---");
        System.out.println("ID ="+order.getId());

    }
}
