package com.bridgelab.stopwatch;

/****************************************************************************************
 * @author mihir
 *
 * @since 24-June-2021
 *
 * In this class we are calculating elapsed time between start and end of print statement.
 * Using System.currentTimeMillis() method to record current system time.
 ****************************************************************************************/

public class StopWatch
{
	public static void main(String[] args)
	{
		//System.currentTimeMillis() method will capture current working system time.
		long startTime = System.currentTimeMillis();
		
		for (int i = 1; i <= 786; i++)
		{
			System.out.println("Calculating elapsed time between start of this print statement till the end.");
		}
		
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nElapsed time is : "+elapsedTime + " milli seconds.");
	}
}
