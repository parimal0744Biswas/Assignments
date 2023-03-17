package com.q1;

import java.util.Scanner;

//WAP to reverse a String.
//Input: “Parimal”
//Output: “lamiraP”

public class Q1_ReverseString
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter A String");

		String str = scanner.next();

		StringBuilder sBuilder = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--)
		{
			sBuilder.append(str.charAt(i));
		}

		System.out.println(sBuilder);

		scanner.close();

	}

}
