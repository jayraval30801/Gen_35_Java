package Gen_35;

import java.util.Scanner;

public class Array2D {

		public static void main(String[] args) 
		{
			int i,j,k,sum=0;
			Scanner sc=  new Scanner(System.in);
			int a[][] = new int[3][3];
			int b[][] = new int[3][3];
			int c[][] = new int[3][3];
			System.out.println("Enter First Matrix");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println("Enter a["+i+"]"+"["+j+"]");
					a[i][j] = sc.nextInt();
				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println("Enter b["+i+"]"+"["+j+"]");
					b[i][j] = sc.nextInt();
				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					for(k=0;k<3;k++)
					{
						sum  = sum + (a[i][j] *b[j][k]);
					}
					c[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Your Output Matrix is ");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+c[i][j]);
				}
				System.out.println();
			}
		}
}
/*
 * User Rows and Columns : input
 * Elements input 
 * Matrix Print
 * 
 * Array : 
 * 	
 * 	2-d array : 
 * 		row , column 
 * 	
 * 	i = rows 
 *  j = columns  
 * 
 * 
 * 1 2    X   4 5   =>   (1*4)+(2*7)   (1*5)+(2*8)
 * 4 5        7 8 		 ....              ...	
 * 
 * 1) Enter Row and Columns from user and Print Sum of Rows and Sum of Columns
 * 2) Enter Row and Columns from User and print Matrix is Identity
 * 3) Enter Row and Columns from user and Print Matrix is Transpose 
 * 4) Enter Row and Columns from user and print prime Elements from array
 * 5) Enter Row and Column from user and print Sum of Diagonal Elements 
 * 
 * 
 * 
 * */
