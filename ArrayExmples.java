package Gen_35;

import java.util.Scanner;

public class ArrayExmples {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a[] = new int[] {1,2,3,4,5,6,7,8,9};
			int i,j,sum;
			System.out.println("ENter the Sum You want from Array");
			sum = sc.nextInt();
			for(i=0;i<a.length;i++)
			{
					for(j=i+1;j<a.length;j++)
					{
						if(a[i]+a[j] == sum)
						{
							System.out.println("("+a[i]+","+a[j]+")");
						}
					}
			}
		}
}
/*
 * 
 * 
 * a[10] = {1,2,3,4,5,6};
 * Enter Sum of Pair you want : 6
 * Output: (4,2) , (5,1) 
 * 
 *Array 1 : {1,2,3};
 *Array 2 : {1,3,2};  				
 *
 *Output : Both are anagram 
 * 
 *Array 2 : {1,2,2,3}; , {1,4,2} => Not Anagram 
 *
 *Task : Array[10] = {11,2,3,5,5,6,7,8,2,3};
 *Occurence of Each Element of Array : 
 *11 Occurence : 1
 *2 Occurence : 2
 *3 Occurence : 2
 *...........
 *	
 *
 *
 * 
 * 
 * */
