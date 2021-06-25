package com.bridgelab.decimaltobinary;

import java.util.Scanner;

/*******************************************
 * @author mihir
 *
 * @since 24-June-2021
 * 
 * Asking user to input decimal number,
 * Converting that number into binary format.
 *******************************************/

public class DecimalToBinary
{
	/**
	 * Name : toBinary
	 * 
	 * Description : Converting decimal number to binary.
	 * 
	 * Algorithm : passing user entered decimal number to function.
	 * first doing modulo of 2 , then storing the output in remainder,
	 * again now dividng the number by 2.storing the output as new number.
	 * storing remainder in string type binaryNumber keep on adding remainder until while loop stops.
	 * At the end reversing string type binaryNumber to get actual binary conversion number.
	 * 
	 * @param decimalUserInput
	 * 
	 * Modified : First commit 24-June-2021;
	 */
	static void toBinary(int decimalUserInput)
	{
		String binaryNumber = "", reversalOfNumber = "";
		int divisor = 2, remainder = 0;
		
	    while(decimalUserInput != 0) 
	    {
	    	remainder = decimalUserInput % divisor;
	        decimalUserInput = decimalUserInput / divisor;
	        binaryNumber = binaryNumber + remainder;
	    }
	    for(int i = binaryNumber.length()-1; i >=0; i--)
	    {
            char readingCharecter = binaryNumber.charAt(i);
            reversalOfNumber += readingCharecter;
        }
        System.out.println("The binary conversion of decimal number is : " + reversalOfNumber);
	}
	
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter decimal number to convert it to binary number : ");
		int decimalUserInput = scannerObject.nextInt();
		scannerObject.close();
		
		toBinary(decimalUserInput);
	}
}
