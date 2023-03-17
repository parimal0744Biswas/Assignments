package com.q4;

import java.util.Set;
import java.util.TreeSet;

public class Q4PangramOrNot
{

	public static void main(String[] args)
	{
		String str1 = "The quick brown fox jumps over the lazy dog";

		// str1.toLowerCase();

//		char[] arr1 =
//		{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//				'w', 'x', 'y', 'z' };
//
//		System.out.println(Arrays.toString(arr1));

		Set<Character> set = new TreeSet<>();

		for (int i = 0; i < str1.length(); i++)
		{
			if (str1.charAt(i) == ' ' || str1.charAt(i) == ',')
			{
				continue;
			}
			else
			{
				set.add(str1.toLowerCase().charAt(i));
			}

		}

		System.out.println(set);
		System.out.println(set.size());

		if (set.size() == 26)
		{
			System.out.println("a Pangram");
		}
		else
		{
			System.out.println("Not a Pangram");
		}

	}
}
