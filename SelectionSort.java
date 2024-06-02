import java.util.*;

public class SelectionSort{
	public static void searching(int a[])
	{
		for(int i=0;i<a.length-1;i++){
			int smallest = i;
			for(int j=i+1; j<a.length;j++){
				if(a[smallest]>a[j]){
					smallest = j;
				}
			}
		int temp = a[smallest];
		a[smallest] = a[i];
		a[i] = temp;
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