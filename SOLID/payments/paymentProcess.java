package payments;

import services.PaymentService;

public class paymentProcess {
    PaymentService paymentService;

    public paymentProcess(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(int amount)
    {
        paymentService.pay(amount);
    }
}
