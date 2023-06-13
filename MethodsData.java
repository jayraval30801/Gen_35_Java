package Gen_35;

import java.util.Scanner;

public class MethodsData {

	Scanner sc = new Scanner(System.in);

	int input() {
		int number;
		System.out.println("Enter A number");
		number = sc.nextInt();
		return number;
	}

	void logic(int num) {
		int temp, rem, sum = 0;
		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is Not Armstrong");
		}
	}

	public static void main(String[] args) {
		MethodsData obj = new MethodsData();
		int l = obj.input();
		obj.logic(l);
	}
}
/*
 * 
 * 
 * Java : 4 types : 1) With arg with ret ..........
 * 
 * Recursion : 
 * Factorial 
 * Palindrome Number : Using Method (number input) (with arg with return) , 
 * 									(number logic) (no return with arg)
 * 
 * 
 * 
 */
