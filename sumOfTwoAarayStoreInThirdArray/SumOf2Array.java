package com.sumOfTwoAarayStoreInThirdArray;

import java.util.Scanner;

public class SumOf2Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter length of array");
	    int arr1[]=new int[scan.nextInt()];
	  
	    System.out.println("enter the array1   elements");
	    for(int i=0;i<=arr1.length-1;i++)
	    {
	    	arr1[i]=scan.nextInt();
	    }
	    int arr2[]=new int[arr1.length];
	    System.out.println("enter  array2 elemets");
	    
	    for(int i=0;i<=arr2.length-1;i++)
	    {
	    	arr2[i]=scan.nextInt();
	    }
	    System.out.println("array 1  elemts");
	    for (int x : arr1) {
	    	System.out.print( x+"  ");
			
		}
	    
	    
	    System.out.println("array 2 elemts");
	    for (int y : arr2) {
	    	System.out.print( y+" ");
			
		}
	    
	    SumApp s=new SumApp();
	    int res[]=s.find(arr1,arr2);
	    System.out.println(res);
	    for(int x:res)
	    {
	    	System.out.println(x);
	    }
	    }

	
	    	
	}


