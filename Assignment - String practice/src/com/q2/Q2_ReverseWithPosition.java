package com.q2;

//2. WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”

public class Q2_ReverseWithPosition
{
	public static void main(String[] args)
	{
		String str1 = "Think Twice";

		String arr1[] = str1.split(" ");

		// System.out.println(Arrays.toString(arr1));

		StringBuilder newString = new StringBuilder();

		for (int i = 0; i < arr1.length; i++)
		{
			if (i == arr1.length - 1)
			{
				newString.append(Jio(arr1[i]));
			}
			else
			{
				newString.append(Jio(arr1[i]) + " ");
			}

		}

		System.out.println(newString);

	}

	private static StringBuilder Jio(String str)
	{
		StringBuilder sBuilder = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--)
		{
			sBuilder.append(str.charAt(i));
		}

		return sBuilder;

	}

}
