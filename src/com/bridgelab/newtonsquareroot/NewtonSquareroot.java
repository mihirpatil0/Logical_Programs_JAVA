package com.bridgelab.newtonsquareroot;

import java.util.Scanner;

/******************************************************************************************************************
 * @author mihir
 * 
 * @since 24-June-2021
 * 
 * In this class we are computing the square root of a nonnegative number c given in the input using Newton's method:
 * - initialize t = c
 * - replace t with the average of c/t and t
 * - repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;
 *******************************************************************************************************************/

public class NewtonSquareroot
{
	public static void main(String[] args)
	{
		System.out.println("Program to find the Square root of a number");
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number to find sqrt : ");
		int userInput=scannerObject.nextInt();
		scannerObject.close();
		
		double t = userInput;
		double epsilon = (1e-15);
		while ((double) Math.abs ( t - userInput / t ) > epsilon * t )
		{	
		 t = (double) ( t + userInput / t ) / 2;
		}
		System.out.println("Square root of " + userInput + " is " + t);
	}
}
