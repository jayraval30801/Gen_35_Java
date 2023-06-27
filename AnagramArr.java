package Gen_35;

public class AnagramArr {

	public static void main(String[] args) {
		boolean bol= true;
		int temp;
		int i,j;
		int a[]= new int[] {1,2,3}; // 1 2 3
		int b[] = new int[] {4,1,3}; // 1 3 4
		//Sorting of Both are;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<b.length;i++)
		{
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i] != b[i])
			{
				bol = false;
			}
		}
		if(bol == true)
		{
			System.out.println("Both are anagram");
		}
		else
		{
			System.out.println("Both are not anagram");
		}
	}
		
}
