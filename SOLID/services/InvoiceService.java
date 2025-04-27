package services;

import model.Order;

public class InvoiceService {
    public void generateInvoice(Order order) {
        System.out.println("--- Invoice generated ---");
        System.out.println("ID ="+order.getId());
        System.out.println("NAME ="+order.getName());
        System.out.println("AMOUNT ="+order.getAmount());
    }
}
