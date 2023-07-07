package Gen_35;

import java.util.Scanner;

public class MethodsExample2 {
	
	static Scanner sc = new Scanner(System.in);
	static int[] getArrEle()
	{
		int a[] = new int[5];
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter a["+i+"]");
			a[i] = sc.nextInt();
		}
		return a;
	}
	static void printEle(int a[])
	{
		
		System.out.println("Elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
		public static void main(String[] args) {
			
				//getArrEle();
				printEle(getArrEle());
		}
}
