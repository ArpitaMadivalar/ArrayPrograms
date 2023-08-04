package com.mergElemts;

import java.util.Scanner;

public class MergeApproach2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter length of array");
	     int n=scan.nextInt();
	     int arr1[]=new int[n];
	     System.out.println("enter array elements");
	     for(int i=0;i<=arr1.length-1;i++)
	     {
	    	 arr1[i]=scan.nextInt();
	     }
	     
	     System.out.println("enter second array length");
	     int arr2[]=new int[scan.nextInt()];
	     System.out.println("enter array 2 elements");
	     for(int i=0;i<=arr2.length-1;i++)
	     {
	    	 arr2[i]=scan.nextInt();
	     }
	     
	     System.out.println("array 1 elements are.....");
	     for (int x : arr1) {
	    	 System.out.println(x);
			
		}
	     
	     
	     System.out.println("array 2 elements are.....");
	     for (int x : arr2) {
	    	 System.out.println(x);
			
		}
	     System.out.println("array 3  elemts are");
	     MergeApproach2App app=new MergeApproach2App();
	     int res[] =app.findSum(arr1,arr2);
	     for (int x : res) {
	    	 System.out.println(x);
			
		}
	}

}
