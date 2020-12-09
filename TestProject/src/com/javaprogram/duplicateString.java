package com.javaprogram;

import java.util.HashMap;
import java.util.Map;

public class duplicateString {
	
	public static void countduplicatestring(String str)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] charArray = str.toCharArray();
		for(char c : charArray)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else 
			{
				map.put(c,1);
			}
			// Traverse the hashmap check if the count of the charcter is greater than print
			//the character and its frequency// 
			}
		for (Map.Entry<Character,Integer>entry :map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
		//driver the code
 public static void main(String[] args) {
	//given String//
	 String str = "rajkumartripathi";
	 countduplicatestring(str);
}
}
