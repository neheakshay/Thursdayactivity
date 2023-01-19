package com.question1;

public class Firstandlastdigit {

	public static void main(String[] args) {
		int number = 30246691;
        int firstDigit = 0;
        int lastDigit = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);

	}

}