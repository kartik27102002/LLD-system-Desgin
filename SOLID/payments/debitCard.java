package payments;

import services.PaymentService;

public class debitCard implements PaymentService {
    public void pay(int amount) {
        System.out.println("Payment by debit Card"+amount);
    }
}
