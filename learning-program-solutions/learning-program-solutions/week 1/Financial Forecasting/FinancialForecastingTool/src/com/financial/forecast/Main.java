package com.financial.forecast;

public class Main {

	public static void main(String[] args) {
		double presentValue = 10000;
        double annualGrowthRate = 0.05; // 5%
        int years = 5;

        double futureValue = Forecast.predictFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Predicted Future Value after %d years: %.2f", years, futureValue);
    

	}

}
