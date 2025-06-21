package com.decorator;

public class Main {

	public static void main(String[] args) {
		 // Email only
        Notifier email = new EmailNotifier();
        email.send("Your order has been placed.");

        System.out.println();

        // Email + SMS
        Notifier emailSms = new SMSNotifierDecorator(new EmailNotifier());
        emailSms.send("Your payment is successful.");

        System.out.println();

        // Email + SMS + Slack
        Notifier allChannels = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        allChannels.send("Server is down!");
	}

}
