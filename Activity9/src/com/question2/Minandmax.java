package com.question2;

public class Minandmax {
	   public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
	      int[] myArray = {22, 95, 56, 40, 90};
	      Minandmax m = new Minandmax();
	      System.out.println("Maximum value in the array is::"+m.max(myArray));
	      System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
}