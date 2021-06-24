package com.bridgelab.reversenumber;

import java.util.Scanner;

/**********************************************************************************
 * @author mihir
 * 
 * @since 24-June-2021
 * 
 * In this class accepting number from user, reversing it and printing it.
 * using while loop to perform recursive operations such as modulo, multiplication,
 * addition and and division to get reverse of a number.
 *********************************************************************************/

public class ReverseANumber
{
	public static void main(String[] args)
	{
		int remainder = 0,reverseNumber = 0;
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Enter a number to reverse it : ");
		int userInputNumber = scannerObject.nextInt();
		scannerObject.close();
		
		while( userInputNumber != 0 )
		{
			remainder = userInputNumber % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			userInputNumber /= 10;
		}
		System.out.println("The reversal of a given is : " + reverseNumber);
	}
}
