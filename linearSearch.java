import java.util.*;

public class linearSearch{
	public static int searching(int a[], int key){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}

		System.out.println("key: ");
		int key = s.nextInt();

		System.out.println(searching(arr,key));
	}
}