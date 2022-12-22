package com.question3;

import java.util.ArrayList;

public class Fruit {

	public static void main(String[] args) {
		ArrayList<String> FruitBucket1=new ArrayList<>(); //FruitBucket1
		FruitBucket1.add("Mango");
		FruitBucket1.add("Apple");
		FruitBucket1.add("Orange");
		System.out.println(FruitBucket1);
		System.out.println("-------------------------------------------");
		ArrayList<String> FruitBucket2= new ArrayList<>(); //FruitBucket2
		FruitBucket2.add("WaterMelon");
		FruitBucket2.add("Grapes");
		FruitBucket2.add("Cherry");
		System.out.println(FruitBucket2);
		FruitBucket1.addAll(FruitBucket2); //Adding FruitBucket1 and FruitBucket2
		System.out.println(FruitBucket1);
		System.out.println("Whether mango is in the FruitBucket1?"+FruitBucket1.contains("Mango")); //checking fruit present or not
		System.out.println("Whether FruitBucket1 is empty or not"+FruitBucket1.isEmpty()); //checking FruitBucket1 is empty or not
		FruitBucket1.remove("Apple"); //removing one fruit from FruitBucket1
		System.out.println(FruitBucket1);
	}
}