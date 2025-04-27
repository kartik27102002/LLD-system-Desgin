import model.Order;
import payments.creditCard;
import payments.debitCard;
import payments.paymentProcess;
import services.InvoiceService;
import services.orderRepo;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Order o= new Order(1,"Kartik G",100000);

      paymentProcess p= new paymentProcess(new debitCard());
      p.makePayment(o.getAmount());

        InvoiceService s= new InvoiceService();
        s.generateInvoice(o);

        orderRepo or= new orderRepo();
        or.save(o);






        }

}