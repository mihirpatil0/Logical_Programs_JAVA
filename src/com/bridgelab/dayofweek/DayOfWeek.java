package com.bridgelab.dayofweek;

import java.util.Scanner;

/**
 * @author mihir
 *
 * @since 24-June-2021
 * 
 * In this class we takes a date as input and prints the day of the week that date falls on date.
 * Using Gregorian calendar formula to do the computation.
 * Program takes three command-line arguments: m (month), d (day), and y (year).
 */
public class DayOfWeek
{
	public static void main(String[] args)
	{
		System.out.println("Program to find a week day with given date .");
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Enter the date of the month : ");
		int userInputDate = scannerObject.nextInt();
		
		System.out.print("Enter the month in value : ");
		int userInputMonth = scannerObject.nextInt();
		
		System.out.print("Enter the Year : ");
		int userInputYear = scannerObject.nextInt();
		
		scannerObject.close();
		
		//Gregorian calendar formula to do the computation.
		int Y = userInputYear - ( 14 - userInputMonth ) / 12;
		int x = Y + Y / 4 - Y / 100 - Y / 400;
		int M = userInputMonth + 12 * (( 14 - userInputMonth ) / 12 ) - 2;
		int D = ( userInputDate + x + 31 * M / 12 ) % 7;
		
		switch (D) 
		{
			case 0: System.out.println("Given date falls on --> Sunday");
			break;
			case 1: System.out.println("Given date falls on --> Monday");
			break;
			case 2: System.out.println("Given date falls on --> Tuesday");
			break;
			case 3: System.out.println("Given date falls on --> Wednesday");
			break;
			case 4: System.out.println("Given date falls on --> Thursday");
			break;
			case 5: System.out.println("Given date falls on --> Friday");
			break;
			case 6: System.out.println("Given date falls on --> Saturday");
		}
	}
}
