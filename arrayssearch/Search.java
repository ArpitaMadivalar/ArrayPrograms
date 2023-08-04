package com.arrayssearch;

public class Search {

		public boolean isPresent(int arr[],int key)
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				if(key==arr[i])
				{
					return true;
				}
				
			}
			return false;
		}


	}


