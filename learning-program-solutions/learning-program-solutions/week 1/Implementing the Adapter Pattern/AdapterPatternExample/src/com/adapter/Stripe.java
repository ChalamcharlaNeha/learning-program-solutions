package com.adapter;

public class Stripe {
	public void doTransaction(String amount) {
        System.out.println("Paid " + amount + " using Stripe");
    }
}
