package payments;

import services.PaymentService;

public class upi implements PaymentService {
    public void pay(int amount) {
        System.out.println("Payment by UPI"+amount);
    }
}
