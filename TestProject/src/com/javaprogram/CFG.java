package com.javaprogram;

import java.util.HashMap;
import java.util.Map;

public class CFG {
	public static void countduplicatechar(String str)
	{
		//create hasmap containg char as a key and ocuerness as a value//
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		//converting given String into a charArray//
		char[] charArray = str.toCharArray();
		//Checking each character of Array
		for (char c : charArray)
		{
			if(map.containsKey(c))
			{
				//if character is present in map incrementing its count by =1//
				map.put(c,map.get(c)+1);
			}
			else
			{
				//if character is not present in map putting this character into map with 1 as its value 
				map.put(c,1);
				
			}
		}
			//traverse the hashmap check if the count of the character is grater than 1 then print the 
			//character and its frequency //
			for (Map.Entry<Character,Integer> entry : map.entrySet())
			{
				if (entry.getValue()>1)
				{
					System.out.println(entry.getKey()+":"+entry.getValue());
				}
			}
			
		
		}
		
	public static void main(String[] args) {
		//Given String str
		String str = "RajKumarTripathi";
		//fuction call//
		countduplicatechar(str);
		
	}
	}

	


