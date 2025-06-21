package com.adapter;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment("₹500");

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment("₹1000");
	}

}
