package com.question3;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("How many rows you want in this pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value=1;
		
		System.out.println("here is your pattern:");
	    
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(value+"\t");
			value++;
			}
			System.out.println();
		}
		
	}

}