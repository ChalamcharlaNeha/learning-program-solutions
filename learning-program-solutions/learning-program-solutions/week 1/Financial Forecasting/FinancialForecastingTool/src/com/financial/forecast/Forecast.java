package com.financial.forecast;

public class Forecast {
	 public static double predictFutureValue(double presentValue, double rate, int years) {
	        if (years == 0) {
	            return presentValue;
	        } else {
	            return predictFutureValue(presentValue, rate, years - 1) * (1 + rate);
	        }
	    }
}
