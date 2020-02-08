package com.arraybased;
import java.util.ArrayList;
import java.util.Arrays;

public class FindTwoElementsForSum {

	public static void main(String[] args) {
		
		int[] a = { 1, 4, 45, 6, 10, -8 };
		int num = 16;
		
		ArrayList<Integer> result = findTwoElementsForSum( a, num);
		
		if( null != result)
			System.out.println(result);

	}

	private static ArrayList<Integer> findTwoElementsForSum(int[] a, int num) {
		
		ArrayList<Integer> result = new ArrayList<>();
		int s = 0;
		int e = a.length - 1;

		Arrays.sort(a);

		while(s < e) {

			if(a[s] + a[e]  == num) {
				result.add(a[s]);
				result.add(a[e]);
				return result;
			}

			else if(a[s] + a[e]  < num)
				s++;
			else
				e--;
		}

		return result;
		
	}

}
