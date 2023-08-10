package com.met.SingleDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

/*Array using runtime input values and to
 * find the largest element*/

public class ArrayMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no. of array elements");
		
		int n = s.nextInt();
		//array declaration
		int arr[]=new int [n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("array elements are: ");
		for(int i = 0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i = 0;i<n;i++)
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element is: "+max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		
	}

}