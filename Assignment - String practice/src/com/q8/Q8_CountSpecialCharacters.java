package com.q8;

//WAP to count number of special characters.
public class Q8_CountSpecialCharacters
{
	public static void main(String[] args)
	{
		String str = "#eshgbjJGJG787-@";

		int specialCount = 0;

		for (int i = 0; i < str.length(); i++)
		{
			if (checker(str.charAt(i)));
			{
				specialCount++;
			}
		}

		System.out.println("Special characters : " + specialCount);
	}

	private static boolean checker(char chars)
	{
		boolean sepacialchar;

		if ((chars >= 'a' && chars <= 'z') || (chars >= 'A' && chars <= 'Z'))
		{
			sepacialchar = false;
		}

		else if (chars >= '0' && chars <= '9')
		{
			sepacialchar = false;
		}
		else
		{
			sepacialchar = true;
		}

		return sepacialchar;

	}

}
