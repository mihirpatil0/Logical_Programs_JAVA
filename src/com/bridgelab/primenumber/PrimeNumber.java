package com.bridgelab.primenumber;

import java.util.Scanner;

/**
 * @author mihir
 *
 * In this class we are accepting number from user,
 * and checking if the number is prime or not.
 * If number is divisible by other than 1 and itself then it is not a prime number.
 */
public class PrimeNumber
{
	public static void main(String[] args)
	{
		
		Scanner scannerObject = new Scanner(System.in);		
		System.out.print("Enter a Number to check if it is a prime number or not : ");
		int userInputNumber = scannerObject.nextInt();
		scannerObject.close();
		
		boolean isPrimeNumber = true;
		
		//checking if user input number is 0 or 1.
		if(userInputNumber <= 0 || userInputNumber == 1)
			System.out.println(userInputNumber + " is not a prime number");
		else
		{
			//loop will start to run from 2 till half range of a given number because if we keep on dividing it it will give float value.
			for(int i = 2; i <= userInputNumber / 2; i++)
			{
				if(userInputNumber % 2 == 0)
				{
					isPrimeNumber = false;
					break;
				}
					
			}
		}
		if(!isPrimeNumber)
		{
			System.out.println(userInputNumber + " is not a prime number.");
		}
		else
		{
			System.out.println(userInputNumber + " is a prime number.");
		}
	}
}
