package com.arraybased;

public class SecondAndThirdHighestInArray {

	public static void main(String[] args) {
		
		int[] array = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		getSecondAndThirdHighest(array);

	}

	private static void getSecondAndThirdHighest(int[] array) {
		
		int highest = array[0];
		int secondHighest = array[0];
		int thirdHighest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(highest < array[i])
			{
				secondHighest = highest;
				highest = array[i];
			}
			else if (secondHighest < array[i]) {
				thirdHighest = secondHighest;
				secondHighest = array[i];
			}
			else if (thirdHighest < array[i]) {
				thirdHighest = array[i];
			}
			
		}
		
		System.out.println("Second highest: " + secondHighest + " Third highest: " + thirdHighest);
	
	}

}



