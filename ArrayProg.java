package Gen_35;

public class ArrayProg {

	public static void main(String[] args) {
		
		int a[] = new int[] { 1, 2, 3 ,5,6,4};
		int b[] = new int[] { 1, 3, 4 };
		int i, j,k=0;
		int c[] = new int[3];
		for (i = 0; i < a.length; i++) //i=1
		{
			for(j=0;j < b.length; j++)//j=3
			{
					if(a[i] == b[j]) // 
					{
						break;
					}
			}
			if(j==b.length) // j= 0 , b.length = 3 
			{
				c[k] = a[i];
				k++;
			}
		}
		System.out.println("Uncommon Elements are");
		for(i=0;i<k;i++)
		{
			System.out.println("\t"+c[i]);
		}
	}
}
/*
 * User Array input : Intersact Element : a[] = {1,2,3} b[] = {1,3,4} output :
 * c[] = {2,4}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
