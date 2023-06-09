package Gen_35;

public class LoopsInJava {

		public static void main(String[] args) {
			
				int i,j;
				int a=12,b=3;
				for(i=1;i<=5;i++) //i=10 10<10 10%2==0
				{
					for(j=1;j<=i;j++)
					{
						System.out.print(""+j);
					}
					System.out.println();
				}
		}
}
/*
 * 
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  
 *  
 *  
 *  1
 *  33
 *  555
 *  7777
 *  99999
 *  
 *  1
 *  123
 *  12345
 *  1234567
 *  
 *  
 *  
 *  switch => 
 *  	enter your age : 
 *  			
 *  	1-14
 *  		Enter How many people Going : 12 
 *  				Enter Which Class You Want trip : 
 *  								Normal Class : 800/- 
 *  								Delux Class : 1500/- 
 *  								Business Class : 2000/-
 *  								First Class : 2500/-  
 *  	14-30  
 *  	30-60
 *  	60 - more => You are not Eligible for Trip  
 *  	
 *  	
 *  
 *  
 * 
 * 
 * */
