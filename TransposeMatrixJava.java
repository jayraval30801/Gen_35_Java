package Gen_35;

import java.util.Scanner;

public class TransposeMatrixJava
{
	
	public static void main(String[] args) 
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter a["+i+"]"+"["+j+"]");
				a[i][j]  = sc.nextInt();
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j] != a[j][i])
				{
					temp  = 1; 
					break;
				}
			}
		}
		
		if(temp==1)
		{
			System.out.println("Not a Transpose Matrix");
		}
		else
		{
			System.out.println("It is a Transpose Matrix");
		}
			
	}
}
/*
 * a[3][3] 
 * 
 * 1 2 3 
 * 2 4 5  
 * 3 5 7 
 * 
*/
