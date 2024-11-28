package com.sunbeam;

import java.util.Scanner;

public class BinarySearchDesc {
	public static void main(String[] args)
	{ int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10}; 
	Scanner sc=new Scanner(System.in);
	int target = sc.nextInt(); 
	int result = binarySearchDescending(arr, target); 
	if (result != -1) 
	{ System.out.println("Element found at index: " + result+1); }
	else 
	{ System.out.println("Element not found in the array"); }
	}

	private static int binarySearchDescending(int[] arr, int target) {
		int left = 0; 
		int right = arr.length-1;
		while (left <= right) { 
			int mid = left + (right - left) / 2; 
		
		if (arr[mid] == target)
		{ 
			return mid; 
		} 
		if (arr[mid] > target) { 
			left = mid + 1; } 
		else 
			{  
			right = mid - 1; 
			} 
		}
		return -1;
	}

}

