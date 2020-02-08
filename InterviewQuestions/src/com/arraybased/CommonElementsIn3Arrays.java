package com.arraybased;
import java.util.ArrayList;

public class CommonElementsIn3Arrays {
	
	public static void main(String[] s) {
		
		int[] ar1 = {1, 4, 5, 5};
		int[] ar2 = {3, 4, 5, 5, 10};
		int[] ar3 = {5, 5, 10, 20};
		
		ArrayList<Integer> result = method1(ar1, ar2, ar3);
		System.out.println(result);
	}

	private static ArrayList<Integer> method1(int[] ar1, int[] ar2, int[] ar3) {
		
		ArrayList<Integer> result = new ArrayList<>();
		int a = 0;
		int b = 0;
		int c = 0;
		
		while( a < ar1.length && b < ar2.length && c < ar3.length) {
			
			if(ar1[a] == ar2[b] && ar2[b] == ar3[c]) {
				result.add(ar1[a]);
				a++;
				b++;
				c++;
			}
			
			else if(ar1[a] < ar2[b])
				a++;
			
			else if(ar2[b] < ar3[c])
				b++;
			
			else
				c++;

		}
		return result;
		
	}

}
