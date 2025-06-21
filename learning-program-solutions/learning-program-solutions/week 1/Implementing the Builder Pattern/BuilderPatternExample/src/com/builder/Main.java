package com.builder;

public class Main {

	public static void main(String[] args) {
		Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setBluetoothEnabled(true)
                .build();

        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                .setStorage("500GB HDD")
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.showSpecs();
        
        System.out.println("\nOffice PC Configuration:");
        officePC.showSpecs();
    }

}
