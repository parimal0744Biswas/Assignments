package com.q7;

public class Q7_ViowlConsonent
{
	public static void main(String[] args)
	{

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
