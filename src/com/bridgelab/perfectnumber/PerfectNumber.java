package com.bridgelab.perfectnumber;

import java.util.Scanner;

/**
 * @author mihir
 * 
 * In this program we are checking if a number is a perfect number or not.
 * What is perfect number - The Perfect Number is also a special type of
 * positive number. When the number is equal to the sum of its positive divisors
 * excluding the number, it is called a Perfect Number.
 * Example 28 = Divisors are 1, 2, 4, 7, 14. Addition of divisors is 28.
 */
public class PerfectNumber
{
	public static void main(String[] args)
	{
		int sumOfDivisors = 0;
		Scanner scannerObject = new Scanner(System.in);		
		System.out.print("Enter a Number to find if it is perfect number or not : ");
		int userInputNumber = scannerObject.nextInt();
		scannerObject.close();
		
		for(int i = 1; i < userInputNumber; i++ )
		{
			if( userInputNumber % i == 0 )
			{
				//adding divisor number to sumOfDivisors variable.
				sumOfDivisors += i;
			}
		}
		if( sumOfDivisors == userInputNumber )
		{
			System.out.println("Given number is a perfect number.");
		}
		else
		{
			System.out.println("Given number is not a perfect number.");
		}
	}
}
