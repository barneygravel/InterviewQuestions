package com.addtime;

public class AddTime {


	public String addTimes(String input) {
		
		String output = null;
		String[] times = input.split(" ");
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		for (int i = 0; i < times.length; i++) {
			String[] m = times[i].split(":");
			seconds += Integer.parseInt(m[1]);
			minutes += Integer.parseInt(m[0]);
		}
	
		if (seconds > 60)
		{
			minutes = minutes + (seconds / 60);
			seconds = seconds % 60;
		}
		
		
		if (minutes > 60)
		{
			hours = hours + (minutes / 60);
			minutes = minutes % 60;
		}
				
		output = hours + ":" + minutes + ":" + seconds;
		
		return output;
	}

}
