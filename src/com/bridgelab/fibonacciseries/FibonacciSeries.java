package com.bridgelab.fibonacciseries;

import java.util.Scanner;

/******************************************************************************************************
 * @author mihir
 *
 * In this class we are printing Fibonacci series, is a special type of series in which the next term,
 * is the sum of the previous two terms. For example, if 0 and 1 are the two previous terms in a series,
 * then the next term will be 1(0+1).
 * Asking user to enter the number to find fibonacci series.
 ******************************************************************************************************/

public class FibonacciSeries
{	
	
	/**
	 * Name : printFibonacciSeries.
	 * 
	 * Description : This function will print fibonacci series.
	 * 
	 * Algorithm : Passing userInput number as a parameter. for loop will run till user given value.
	 * doing addition of previous number and next number and storing it in next number variable.
	 * swapping variables value to keep on printing next number.
	 * 
	 * @param userInput //user given number.
	 * 
	 * Modification : Initial commit 24-June-2021.
	 */
	public static void printFibonacciSeries(int userInput)
	{
		int previousNumber = 0, currentNumber = 1, nextNumber = 0;
		System.out.print("The fibonacci series is : " + previousNumber + "," + currentNumber);
		
		for(int i = 2; i <= userInput; i++)
		{
			nextNumber = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			System.out.print("," + nextNumber);
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter a positive number to find fibonacci series : ");
		Scanner scannerObject = new Scanner(System.in);
		int userInput = scannerObject.nextInt();
		scannerObject.close();
		
		//calling function and passing userInput as parameter.
		printFibonacciSeries(userInput);
		
	}
}
