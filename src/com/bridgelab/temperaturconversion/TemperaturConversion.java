package com.bridgelab.temperaturconversion;

import java.util.Scanner;

/*******************************************************************
 * @author mihir
 *
 * @since 24-June-2021
 * 
 * Given the temperature in fahrenheit as input.
 * outputs the temperature in Celsius or viceversa using the formula.
 * Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
 * Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
 *******************************************************************/

public class TemperaturConversion
{
	
	/**
	 * Name : CelsiusToFahrenheit.
	 * 
	 * Description : function takes user input as celsius and convert it to farenheit.
	 * 
	 * Algorithm : Function calculate farenheit from given default universal formula which takes celsius as user input.
	 * 
	 * @param userCelsius
	 * 
	 * Modification : Fist commit 24-June-2021.
	 */
	public static void CelsiusToFahrenheit(int userCelsius)
	{
		double fahrenheit =(double)(userCelsius*9/5)+32;
		System.out.println(userCelsius+" Celsius in Fahrenheit is "+fahrenheit);
	}
	
	/**
	 * Name : FahrenheitToCelsius.
	 * 
	 * Description : function takes user input as fahrenheit and convert it to celsius.
	 * 
	 * Algorithm : Function calculate celsius from given default universal formula which takes fahrenheit as user input.
	 * 
	 * @param userCelsius
	 * 
	 * Modification : Fist commit 24-June-2021.
	 */
	public static void FahrenheitToCelsius(int userFahrenheit)
	{
		double celsius =(double)(userFahrenheit-32)*5/9;
		System.out.println(userFahrenheit+" Celsius in Fahrenheit is "+celsius);
	}
		
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Temperatur Conversion");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("1-Celsius to Fahrenheit\n2-Fahrenheit to Celsius\nChoose any one.");
		int userChoice = scannerObject.nextInt();
		scannerObject.close();
		
		switch(userChoice)
		{
			case 1:	
					System.out.println("Enter the value of Celsius : ");
					int userCelsius = scannerObject.nextInt();
					CelsiusToFahrenheit(userCelsius);
					break;
			case 2:	
					System.out.println("Enter the value of Fahrenheit : ");
					int userFahrenheit = scannerObject.nextInt();
					FahrenheitToCelsius(userFahrenheit);
					break;
		}
	}
}
