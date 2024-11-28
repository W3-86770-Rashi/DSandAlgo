package com.sunbeam;

import java.util.Scanner;

public class LinearSearchForOccurence {
	
	public static int linearSearch(int arr[], int key) {
		
		for(int i=arr.length-1; i >=0 ; i--) {
		
			if(key == arr[i]) {
			
				return ++i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {88, 33, 33, 99, 11, 77, 22, 33, 14};
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("index of last occurance of key " + index);

	}

}

