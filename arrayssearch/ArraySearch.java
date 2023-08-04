package com.arrayssearch;

import java.util.Scanner;



public class ArraySearch {

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
	     System.out.println("enter key to search");
	     int key=scan.nextInt();
     
	     Search li=new Search();
	     boolean res=li.isPresent(arr,key);
	     if(res==true)
	     {
	    	 System.out.println("Target found");
	     }
	     else
	     {
	    	 System.out.println("Target Not Found");
	     }
	}

}
