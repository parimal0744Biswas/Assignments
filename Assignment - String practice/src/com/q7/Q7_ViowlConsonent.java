package com.q7;

public class Q7_ViowlConsonent
{
	public static void main(String[] args)
	{
//		String string = "hello world";
//
//		char arr[] =
//		{ 'a', 'e', 'i', 'o', 'u' };
//
//		int VowelCounter = 0;
//		int ConsonentCounter = 0;
//		for (int i = 0; i < string.length(); i++)
//		{
//			for (int j = 0; j < arr.length; j++)
//			{
//				if (string.charAt(i) == arr[j])
//				{
//					VowelCounter++;
//				}
//				else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
//				{
//					ConsonentCounter++;
//				}
//			}
//		}
//
//		System.out.println("Vowel is--> " + VowelCounter + "   ======  " + "Consonent is----> " + ConsonentCounter);

		String string = "hello world";
		int vowelCount = 0;
		int consonantCount = 0;

		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++)
		{
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelCount++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				consonantCount++;
			}
		}

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);

	}
}
