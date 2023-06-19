package Gen_35;

import java.util.Scanner;

public class MethodsInJava {
	
	public static void main(String[] args) 
	{	
		int a[] = {2,33,4,1,2,3,44}; // Declaration 
		int b[] = new int[]{1,22,344,4}; // 2nd Declaration 
		int c[] = new int[78];//3rd declaration 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Element you want to enter");
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a["+i+"]");
			c[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(c[i]);
		}
	}
}
/*
 * 
 * Array : 
 * 		User define Datatype. 
 * 	Multiple Data with similiar Datatype store Array 
 * Declaration : 
 * 			int a[] = {12,2,33,44}; 
 * 			 		or
 * 			int a[] = new int[SIZE];
 * 
 * Array Tasks : 
 * 		1) Positive & Negative Elements From Array
 * 		2) Even & Odd Number Count In Array
 * 		3) Prime Numbers from Array
 * 		4) Ascending Order Arrange
 * 		5) Maximum Element from Array
 *  
 * 
 * 
 * 
 * */