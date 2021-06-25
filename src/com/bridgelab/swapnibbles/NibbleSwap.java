package com.bridgelab.swapnibbles;

import java.util.Scanner;

/********************************************************************************
 * @author mihir
 *
 * @since 24-June-2021
 * 
 * In this class we are asking user to input decimal number.
 * finding binary number for it. swapping nibbles,
 * again finding decimal number for newly created binary number after nibble swap.
 * checks if that decimal number is power of 2 or not.
 ********************************************************************************/

public class NibbleSwap
{
	public static void swapNibble(String binaryNumber, int userNumber)
	{
		int binnaryOne = Integer.parseInt(binaryNumber);
		int nibbleOne = binnaryOne / 10000;
		int nibbleTwo = binnaryOne % 10000;
		int swapNibble = nibbleTwo * 10000;
		int binary = swapNibble + nibbleOne;
		
		System.out.println("After swapping nibbles Binary number is : " + binary);
		String stringOfBinary = String.valueOf(binary);
		int decimal = Integer.parseInt(stringOfBinary,2);
		System.out.println("Decimal of : " + binary + " is : " + decimal);
		userNumber = decimal;
	
		while(decimal > 1)
		{
			if (decimal % 2 == 0)
			{
				decimal = decimal / 2;
			}
			else
			{
				decimal = 0;
			}
		}
		if (decimal == 0)
		{
			System.out.println(userNumber+" is not a power of 2");
		}
		else
		{
			System.out.println(userNumber+" is power of 2");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program for swapping nibbles of Binary");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the number to find binary value:");
		int userNumber=scannerObject.nextInt();
		scannerObject.close();
		
		String binaryNumber= Integer.toBinaryString(userNumber);
		System.out.println("Binary of "+userNumber+" is "+binaryNumber);
		
		swapNibble(binaryNumber, userNumber);
	}
}
