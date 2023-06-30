package Gen_35;

public class ClockWiseRotationProg {

		public static void main(String[] args) {
			int a[] = new int[] {4,5,6,7,8,9}; //a.length = 6 // {9,4,5,6,7,8};
			int i;
			for(i=0;i<1;i++)
			{
					int j,last;
					last = a[a.length-1];//last = a[5] = 9
					for(j=a.length-1;j>0;j--)// j=5 5>0
					{
						a[j] = a[j-1];  //a[5] = a[4]  = a[5] = 8
					}
					a[0]=last; // a[0] = 9
			}
			for(i=0;i<a.length;i++)
			{
				System.out.println("\t"+a[i]);
			}
		}
}
