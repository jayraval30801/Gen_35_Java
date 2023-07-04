package Gen_35;

import java.util.Scanner;

public class Arra3D {

		public static void main(String[] args) {
			int a[][][] = new int[3][3][3];
			int i,j,k;
			Scanner sc= new Scanner(System.in);
			for(k=0;k<3;k++)
			{
				for(j=0;j<3;j++)
				{
					for(i=0;i<3;i++)
					{
						System.out.println("Enter a["+k+"]"+"["+j+"]"+"["+i+"]"); // a[0][0][0] , a[0][0][1]
						a[k][j][i] = sc.nextInt();
					}
				}
			}
			for(k=0;k<3;k++)
			{
				for(j=0;j<3;j++)
				{
					for(i=0;i<3;i++)
					{
						System.out.print(" "+a[k][j][i]);
					}
					System.out.println();
				}
				System.out.println("\n\n");
			}
		}
}
/*
 *{ 1 2 3   1 2 3   1 2 1
 *  3 4 1   3 4 5   4 2 1
 *  2 3 3 , 6 7 8 , 7 1 6 }
 * 
 *  
 *  
 * 
 * 
 * */
