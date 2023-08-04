package ReplaceNegativeNumberBy0;

import java.util.Scanner;

public class ReplaceNegativeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter length of array");
	    int arr1[]=new int[scan.nextInt()];
	  
	    System.out.println("enter the array1   elements");
	    for(int i=0;i<=arr1.length-1;i++)
	    {
	    	arr1[i]=scan.nextInt();
	    }
	    System.out.println("array elements a are");
	    for (int i=0;i<=arr1.length-1;i++) {
	    	if(arr1[i]<0)
	    	{
	    		arr1[i]=0;
			
	    	}
	    	
		}
	    System.out.println("after replace array elements a are");
	   
	    	for(int x:arr1)
	    	{
	    		System.out.println(x);
	    	}
	} 	
		
	   
	}


