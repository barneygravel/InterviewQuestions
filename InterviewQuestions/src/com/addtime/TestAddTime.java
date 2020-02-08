package com.addtime;

public class TestAddTime {

	public static void main(String[] args) {
		
		String input = "12:32 34:01 15:23 9:27 55:22 25:56";
		AddTime at = new AddTime();
		String output = at.addTimes(input);
		System.out.println(output);

	}

}
