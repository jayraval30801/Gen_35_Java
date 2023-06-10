package Gen_35;

import java.util.Scanner;

public class LoopsPract {

		public static void main(String[] args) {
			int i,j,count;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Starting Point");
			int a = sc.nextInt();
			System.out.println("Enter Ending Point");
			int b = sc.nextInt();
			
			for(i=a;i<=b;i++) 
			{
				count=0;
				for(j=2;j<i;j++) 
				{
					if(i%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("Prime Number is "+i);
				}
			}
		}
}
