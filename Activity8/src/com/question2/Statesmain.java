package com.question2;

public class Statesmain {

	public static void main(String[] args) {
		States s=new States();
		s.addState("Maharashtra");
		s.addState("UttarPradesh");
		s.addState("Rajasthan");
		s.addState("kerala");
		s.addState("MadhyaPradesh");
		
		System.out.println("retrieve the details of the state "+s.retrieveState("Maharashtra"));
		System.out.println("retrieve the details of the state "+s.retrieveState("Uttarpradesh"));

	}
}
