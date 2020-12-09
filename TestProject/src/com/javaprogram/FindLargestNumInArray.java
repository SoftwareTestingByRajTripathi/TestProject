package com.javaprogram;

public class FindLargestNumInArray {
	static int arr[]= {12,34,23,45,56,78};
	
	static int largest()
	{
		int i;
		int max = arr[0];
		for (i=1;i<arr.length;i++)
		
			if(arr[i]>max)
				max=arr[i];
		return max;

	}
	public static void main(String[] args) {
		System.out.println("Largest number of Array "+largest());
	}

}
