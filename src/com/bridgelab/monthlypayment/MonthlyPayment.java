package com.bridgelab.monthlypayment;

import java.util.Scanner;

/*******************************************************************************************************************
 * @author mihir
 * 
 * @since 24-June-2021
 * 
 * In this class we are reads in three command-line arguments P, Y, and R and calculates the monthly payments.
 * that you would have to make over Y years to pay off a P principal loan amount at R per cent
 * interest compounded monthly.
 * The formula is double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
 *******************************************************************************************************************/

public class MonthlyPayment
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Loan Amount : ");
		double loanAmount = scannerObject.nextDouble();
		
		System.out.print("Number of Years : ");
		int years = scannerObject.nextInt();
		
		System.out.print("Annual Interest Rate : ");
		double annualRate = scannerObject.nextDouble();
		scannerObject.close();

		// Calculate monthly interest rate
		double monthlyRate = annualRate / 1200;

		// Calculate monthly payment
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

		// Display monthly payment
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
	}
}
