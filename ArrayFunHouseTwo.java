//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
		int lastVal = 0;

		for (int x : numArray)
		{
			if (x < lastVal)
				return false;
		}
		return true;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
		int lastVal = 1000;

		for (int x : numArray)
		{
			if (lastVal<x)
				return false;

			lastVal = x;
		}

		return true;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larger than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{

		int[] greater = new int[count];
		int pos = 0;

		for (int i : numArray)
		{
			if (i>x && pos<count)
			{
				greater[pos] = i;
				pos++;
			}
		}

		return greater;
	}
}