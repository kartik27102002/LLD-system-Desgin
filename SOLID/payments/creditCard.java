package payments;

import services.PaymentService;

public class creditCard implements PaymentService {

    public void pay(int amount) {
        System.out.println("Payment by creditCard"+amount);
    }
}
