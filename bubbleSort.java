import java.util.*;

public class bubbleSort{
	public static void searching(int a[])
	{
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		
	searching(a);

	System.out.println("\nThe sorted array is: \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}