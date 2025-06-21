package com.adapter;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe = new Stripe();

    public void processPayment(String amount) {
        stripe.doTransaction(amount);
    }
}
