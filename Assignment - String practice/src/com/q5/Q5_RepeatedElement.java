package com.q5;

import java.util.HashSet;
import java.util.Set;

public class Q5_RepeatedElement
{
	public static void main(String[] args)
	{

		String string = "hello world";

		Set<Character> allChars = new HashSet<>();
		Set<Character> repeatedChars = new HashSet<>();

		char[] charArr = string.toCharArray();

		for (char c : charArr)
		{
			if (allChars.contains(c))
			{
				repeatedChars.add(c);
			}
			else
			{
				allChars.add(c);
			}
		}

		System.out.println("Repeated characters: " + repeatedChars);
	}
}
