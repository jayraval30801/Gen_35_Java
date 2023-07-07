package Gen_35;

import java.util.Scanner;

public class TransposeMatrixJava
{
	
	public static void main(String[] args) 
	{
		int rsum = 0,csum=0;
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
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			rsum = 0;
			for(j=0;j<3;j++)
			{	
					rsum = rsum + a[i][j];
			}
			System.out.println("Row"+i+"Sum is "+rsum);
		}
		for(i=0;i<3;i++)
		{
			csum = 0;
			for(j=0;j<3;j++) // j=0
			{	
					csum = csum + a[j][i]; // i=0 csum = a[0][0] a[1][0] , a[2][0]
			}
			System.out.println("Column "+i+"Sum is "+csum);
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
