package com.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			arr[i]=scan.nextInt();			
		}
		System.out.println("Array elements are.........");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		System.out.println("enter element to be search");
		int key=scan.nextInt();
		BinarySearchApp bs=new BinarySearchApp();
		bs.findElement(arr,key);
		
		
		
	}

}
