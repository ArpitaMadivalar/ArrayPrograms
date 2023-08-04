package com.copyArrayElements;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter length of array");
    int arr[]=new int[scan.nextInt()];
  
    System.out.println("enter the elements");
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("after copying elemts");
    int arr2[]=new int[arr.length];
    for(int i=0;i<=arr.length-1;i++)
    {
    	
    	arr2[i]=arr[i];
    	
    }
       System.out.println("after copying arr2[] elements are");
       for(int i=0;i<=arr.length-1;i++)
       {
       	System.out.print(arr2[i]+" ");
       }
       
	}
	
}
