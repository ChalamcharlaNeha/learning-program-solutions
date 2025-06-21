package com.proxy;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("photo1.jpg");

        // Image is loaded only on first display
        image.display(); // loads and displays
        image.display(); // only displays, no loading

	}

}
