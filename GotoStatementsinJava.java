package Gen_35;

import java.util.Scanner;

public class GotoStatementsinJava {

	static void table()
	{
		Scanner sc = new Scanner(System.in);
		int a, i;
		System.out.println("Enter Number for Arithmetic Table");
		a = sc.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println("" + a + "" + i + " " + a * i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		table();
		System.out.println("Do you want to continue");
		String dec = sc.next();
		int p = dec.compareTo("yes");
		int q = dec.compareTo("YES");
		if(p==0 || q==0)
		{
			table();
		}
		else
		{
			System.out.println("You are not able to Create Again");
		}
		
	}
}
/*
 * 
 * continue : current iteration will be skipped Break : Loop Stops from that
 * iteration Goto lable :
 * 
 * lable:
 * 
 * 
 */
