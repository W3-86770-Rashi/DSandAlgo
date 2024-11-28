package com.sunbeam;

import java.util.Scanner;

public class BinarySearchComp {



	public static int binarySearch(int arr[], int key) {
		int left = 0, right = arr.length-1, mid;
		int comp=0;
		
		while(left <= right) {
			
			++comp;
			
			mid = (left + right) / 2;
			
		   if(key == arr[mid])
				
				return mid;
			
			if(key < arr[mid])
				right = mid - 1;
			
			else {
				
				left = mid + 1;
				System.out.println("the no of comp"+comp);
			}           
		}
		return -1;
	}
	public static int binarySearch(int arr[], int key, int left, int right) {
		if(left > right)
			return -1;
	
		int mid = (left + right) / 2;
	
		if(key == arr[mid])
		
			return mid;
		if(key < arr[mid])
			return binarySearch(arr, key, left, mid - 1);
		
		else
			return binarySearch(arr, key, mid + 1, right);
	}

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
		
		sc.close();

	}

}



