package com.sumArray;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter length of array");
	     int n=scan.nextInt();
	     int arr[]=new int[n];
	     System.out.println("enter array elements");
	     for(int i=0;i<=arr.length-1;i++)
	     {
	    	 arr[i]=scan.nextInt();
	     }
	     int sum=0;
	     System.out.println("sum of array elemts are.....");
	     for(int i=0;i<=arr.length-1;i++)
	     {
	    	 sum=sum+arr[i];
	     }
	     System.out.println(sum);
	     

	}

}
