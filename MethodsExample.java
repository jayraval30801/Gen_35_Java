package Gen_35;

import java.util.Scanner;

public class MethodsExample {

	static Scanner sc= new Scanner(System.in);
		static void add()
		{
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("Addition is"+c);
		}
		static void sub(int a,int b)
		{
			System.out.println("Enter a");
			 a = sc.nextInt();
			System.out.println("Enter b");
			b = sc.nextInt();
			int c = a-b;
			System.out.println("Substraction is"+c);
		}
		static int mul()
		{
			System.out.println("Enter a");
			int  a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c = a*b;
			System.out.println("Multiplication is"+c);
			return c;
		}
		static float div(float a,float b)
		{
			float c;
			System.out.println("Enter a");
			 a = sc.nextFloat();
			System.out.println("Enter b");
			b = sc.nextFloat();
			c = a/b;
			return c;
		}
		public static void main(String[] args) 
		{
			System.out.println("Enter Your Choice");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			
			case 1: 
					//addition
					add();
					break;
			case 2:
					// user input
					sub(2,3);// sub(int.int);
					break;
			case 3:
					mul();
					break;
			case 4:
					float d = div(2.33f,4.55f);
					System.out.println("Division is"+d);
					break;
			default:
					System.out.println("Khotu khotu na nakhvu");
			}
		}
}
/*
 *User Define Methods : 
 *	
 *	 		1) Without Return WITHOUT arg : 
 *				void main();	
 *			2) With return Without Arg : 
 *				int add();
 *			3) Without return with arg : 
 *				void add(int,int);
 *			4) with return with arg
 *              int add(int);
 * 
 * */
