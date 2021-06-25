package com.bridgelab.couponnumber;

import java.util.Random;
import java.util.Scanner;

/******************************************************************************************************************************
 * @author mihir
 *
 * @since 24-June-2021
 * 
 * In this class we are generating distinct coupon numbers.
 * taking input from user how many coupon number he want to generate.
 * using random function to generate random values at the same time checking if they are repeating or not.
 * if values are repeating discarding it and creating new values until user get the specified number of distinct coupon numbers.
 ******************************************************************************************************************************/

public class CouponNumber
{
	/**
	 * Name : generateCouponNumbers
	 * 
	 * Description : Generate distinct coupon numbers.
	 * 
	 * Algorithm : this function takes an argument userInput to print number of coupon numbers,
	 * generating random coupon numbers with random.nextInt() method.
	 * storing each distinct coupon numbers in an array if coupon number generate again we discard it but at the same time
	 * count the round of iteration it took to generate distinct coupon numbers.
	 * 
	 * @param userInput
	 * 
	 * Modification : First commit 24-June-2021
	 */
	public static void generateCouponNumbers(int userInput)
	{
		int countTotalRolling = 0;
		
		int[] couponArray = new int[userInput];
		Random randomCoupon = new Random();
		
		for(int i=0; i < couponArray.length; i++)
		{
			couponArray[i] = randomCoupon.nextInt(userInput);
			countTotalRolling ++;
			
			for(int j=0; j < i; j++)
			{
				if(couponArray[i] == couponArray[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.print("\nDistinct coupon numbers are : ");
		for(int i=0; i<couponArray.length; i++)
		{
			System.out.print(couponArray[i] + " ");
		}
		System.out.println("\nTotal itteration taken to generate distinct coupon numbers is : " + countTotalRolling);
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter how many coupon numbers you want to generate : ");
		Scanner scannerObject = new Scanner(System.in);
		int userInput = scannerObject.nextInt();
		scannerObject.close();
		
		generateCouponNumbers(userInput);
	}
}

