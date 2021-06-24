package com.bridgelab.vendingmachine;

import java.util.Scanner;

/***************************************************************************************
 * @author mihir
 * 
 * @since 24-June-2021
 * 
 * In this class we are asking user for rupee he/she want change for.
 * noteArray[] has different notes already stored in it for computation purpose.
 * example { 1000, 500, 100, 50, 10, 5, 2, 1 }.
 * Will do computation in such a way that it will print total number of notes for change. 
 ***************************************************************************************/
public class VendingMachine
{
	public static void vendingmachine(int[] noteArray)
	{
		int changeUserInput, quotientOfDivison, totalNotes = 0;
		
		Scanner scannerObject = new Scanner(System.in);		
		System.out.print("Enter the change to be returned in rupees : ");
		changeUserInput = scannerObject.nextInt();
		scannerObject.close();
		
		System.out.println("different types of denominations and their count:");
		
		for( int i=0; i < noteArray.length; i++ ) 
		{
			quotientOfDivison = changeUserInput / noteArray[i]; 
			
			if( quotientOfDivison > 0 )
			{
				System.out.println( noteArray[i] + "\tx\t" + quotientOfDivison + "\t= " + noteArray[i] * quotientOfDivison );
				totalNotes = totalNotes + quotientOfDivison; 
				changeUserInput = changeUserInput % noteArray[i];
			} 
		}
		System.out.println("Total number of notes required to give change : " + totalNotes);
	}
	public static void main(String[] args)
	{
		int[] noteArray= { 1000, 500, 100, 50, 10, 5, 2, 1 };
		vendingmachine(noteArray);
	}
}
