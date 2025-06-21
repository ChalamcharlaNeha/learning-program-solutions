package com.adapter;

public class PayPalAdapter  implements PaymentProcessor {
    private PayPal payPal = new PayPal();

    public void processPayment(String amount) {
        payPal.makePayment(amount);
    }
}
