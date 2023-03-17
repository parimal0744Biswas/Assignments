package com.q6;

import java.util.Arrays;

//WAP to sort a String Alphabetically.

public class Q6_SortAlphabetical
{
	public static void main(String[] args)
	{
		String string = "hello world";

		char[] arr = string.toCharArray();

//
//		Set<Character> set = new HashSet<>();
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			
//		}

		Arrays.sort(arr);

		for (char c : arr)
		{
			System.out.print(c + " ");
		}
	}
}
