package com.q3;

import java.util.Arrays;

//3. WAP to check if the String is Anagram or not.

public class Q3_StringAnagramOrNot
{
	public static void main(String[] args)
	{
		String str1 = "spare";
		String str2 = "pears";

		String arr1[] = str1.split("");
		String arr2[] = str2.split("");

//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// System.out.println("======================");
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));

		if (arr1.length == arr2.length)
		{
			int count = 0;

			for (int i = 0; i < arr1.length; i++)
			{
				if (arr1[i].equalsIgnoreCase(arr2[i]))
				{
					count++;
				}
			}

			if (arr1.length == count)
			{
				System.out.println("String is Anagram _/ ");
			}
			else
			{
				System.out.println("String is not Anagram");
			}

		}
		else
		{
			System.out.println("String is not Anagram");
		}

	}
}
