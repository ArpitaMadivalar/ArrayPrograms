package com.mergElemts;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
	     int arr1[]= {1,2,3,4};
	     int arr2[]= {7,8,9};
	     int arr1L=arr1.length;
	     int arr2L=arr2.length;
	     int arr3L=arr1L+arr2L;
	     int arr3[]=new int[arr3L];
	     for(int i=0;i<=arr1L-1;i++)
	     {
	    	 arr3[i]=arr1[i];
	     }
	     for(int i=0;i<=arr2L-1;i++)
	     {
	     arr3[arr1.length+i]=arr2[i];
	     }
	     
	      for(int i=0;i<=arr3L-1;i++)
	     {
	     System.out.print(arr3[i]);
	     }
	     
	     
	     }
	     
	     
	}


